/**
 * 
 */
$.fn.extend({
	
	rend_json:function(){
		var $this=$(this);
		//console.log('原内容：'+$this.html());
		if(!$this.html())return;
		
		//console.log($.view_config.rend_json($this.html()))
		$this.html($.view_config.rend_json($this.html()));
	}
	
})
function test(){
	var treedata=[{
		label:"用户管理",
		ul:[
		    {
		    	label:"个人信息"
		    	
		    },{
		    	label:'修改密码'
		    }
		    ]
	},{
		label:'订单管理',
		ul:[
		    {
		    	label:'查看订单'
		    },{
		    	label:'增加订单'
		    }
		    ]
	}
	              
	              ];
	$('#sidebar .accordionContent')._load_tree(treedata);
	              
}