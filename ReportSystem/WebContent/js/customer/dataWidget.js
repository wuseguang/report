/**
 * 接收json数据
 */
TableConfig={
		'depart_search_table':[{label:'部门名称',html:'${departName}'},
		                       {label:'部门编码',html:'${departCode}'},
		                       {label:'部门地址',html:'${departAddress}'},
		                       {label:'员工数',
		                    	   html:'<a class="dataWidget dataWidget-text" target="dialog" href="widgets/user/user_indepart.html?departId=${id}" dataSource="api/user/indepart?count=true&departId=${id}">${totalCount}</a>'
		                    		   },
		                       {label:'操作',
		                    	   html:'<a href="api/depart/delete?id=${id}" target="ajaxTodo" title="确认删除吗？" callback="deleteCallback">删除</a>|\
		                    		   <a target="dialog" href="widgets/depart/depart_info.html?id=${id}">详情</a>'}],
		'user_search_table':[{label:'员工姓名',html:'${userName}'},
		                     {label:'所属部门',html:'<div class="dataWidget dataWidget-text" dataSource="api/depart/info?id=${departId}"><a target="dialog" href="widgets/depart/depart_info.html?id=${departId}">${info.departName}</a></div>'},
		                     {label:'员工编号',html:'${userCode}'}],
		'user_indepart_table':[{label:'员工姓名',html:'${userName}'},{label:'员工编号',html:'${userCode}'}]
}
$.fn.dataWidgetText=function(json){
	$(this).dataWidgetInfo(json);
};
$.fn.dataWidgetLink=function(json){
	var $this=$(this);
	$(this).dataWidgetInfo(json);
	var oldHref=$this.data('oldHref');
	if(!oldHref){
		$this.data('oldHref',$this.attr('href'));
		oldHref=$this.data('oldHref');
	}
	var href=oldHref.injectJSON(json);
	$this.attr('href',href);
}
$.fn.dataWidgetInfo=function(json){
	var $this=$(this);
	var oldContent=$this.data('oldContent');
	if(!oldContent){
		$this.data('oldContent',$this.html())
		oldContent=$this.data('oldContent');
	}
	//console.log(JSON.stringify(json))
	//console.log(oldContent)
	var html=oldContent.injectJSON(json);
	//console.log($this.html());
	//alert(html)
	//console.log('info')
	$this.html(html).initUI();
	//alert(new Date())
	///console.log($this.parent().html());
	//console.log($('#user_search_table').html())
}
$.fn.dataWidgetTable=function(json){
	var $this=$(this);
	//alert(JSON.stringify(json))
	var tableConfig=TableConfig[$this.attr('id')];
	//alert(tableConfig);
	if(!tableConfig)return;
	var dataField=$this.attr('dataField')||"searchResult";
	var searchResult=json[dataField];
	var table=$('<table class="table" width="100%" layoutH="138"></table>');
	var columns=tableConfig.map(function(d){return d.label});
	var thread=$('<thead></thead>').appendTo(table);
	var header=$('<tr></tr>').appendTo(thread);
	columns.forEach(function(c){
		$('<th></th>').text(c).appendTo(header);
	})
	var tbody=$('<tbody></tbody>').appendTo(table)
	searchResult.forEach(function(r){
		var tr=$('<tr></tr>').appendTo(tbody)
		tableConfig.forEach(function(rowConfig){
			var html=rowConfig.html.injectJSON(r);
			$('<td></td>').html(html).appendTo(tr);
		})
	})
	//alert(table.html())
	//alert(new Date())
	
	$this.html(table).initUI();
	//console.log('table')
	//console.log($this.html())
	//var pageStr='<div class="pagination" rel="#rel#" targetType="navTab" totalCount="#totalCount#" numPerPage="#numPerPage#" pageNumShown="10" currentPage="1"></div>';

}
$.fn.dataWidgetUpdate=function(dataSource){
	var $this=$(this);
	if(dataSource)$this.attr('dataSource',dataSource);
	$this.dataWidget();
}
$.fn.dataWidget=function(){
	var $this=$(this);
	if(!$this.hasClass('dataWidget'))return;
	var dataSource=$this.attr('dataSource');
	if(!dataSource)return;
	var data={};
	if($this.attr('widgetData'))data=JSON.parse($this.attr('widgetData'));
	$.post(dataSource,data,function(json){
		if($this.hasClass("dataWidget-text"))$this.dataWidgetText(json);
		if($this.is('a')&&$this.hasClass('dataWidget-link'))$this.dataWidgetLink(json);
		if($this.hasClass('dataWidget-table'))$this.dataWidgetTable(json);	
		if($this.hasClass('dataWidget-info'))$this.dataWidgetInfo(json);	
		$this.data('dataWidgetData',json);
	})
}
$.fn.initDataWidget=function(){
	var $this=$(this);
	if($this.hasClass('dataWidget')){
		$this.dataWidget();
		return;
	}
	$this.children().each(function(){$(this).initDataWidget()})
}