if (!Array.prototype.forEach) {
	Array.prototype.forEach = function(callback, thisArg) {
		var T, k;
		if (this == null) {
			throw new TypeError(" this is null or not defined");
		}
		var O = Object(this);
		var len = O.length >>> 0; // Hack to convert O.length to a UInt32
		if ({}.toString.call(callback) != "[object Function]") {
			throw new TypeError(callback + " is not a function");
		}
		if (thisArg) {
			T = thisArg;
		}
		k = 0;
		while (k < len) {
			var kValue;
			if (k in O) {
				kValue = O[k];
				callback.call(T, kValue, k, O);
			}
			k++;
		}
	};
}

/**
 * 界面配置，role
 */
$
		.extend({
			view_config : {
				"role.manager" : [ {
					label : '个人信息',
					tree : [ {
						label : "用户管理",
						ul : [ {
							label : "个人信息",
							href : 'widgets/user/userInfo.html',
							target : 'navTab',
							rel : 'navtab_userinfo'
						}, {
							label : '修改密码'
						} ]
					} ]
				}, {
					label : '报告管理',
					tree : [ {
						label : '订单管理',
						ul : [ {
							label : '查看订单'
						}, {
							label : '增加订单'
						} ]
					}, {
						label : '报告管理',
						ul : [ {
							label : '查看报告'
						}, {
							label : '编辑报告'
						} ]
					}, {
						label : '客户管理',
						ul : [ {
							label : '查看客户',
							target : 'navTab',
							rel : 'navTab_customersearch',
							href : 'widgets/customer/customer_search.html'
						}, {
							label : '增加客户',
							target : 'navTab',
							rel : 'navTab_customerinsert',
							href : 'widgets/customer/customer_insert.html'
						} ]
					}, {
						label : '人员管理',
						ul : [ {
							label : '查看人员',
							target:'navTab',
							rel:'navTab_personsearch',
							href:'widgets/person/person_search.html'
						}, {
							label : '增加人员',
							target : 'navTab',
							rel:'navTab_personinsert',
							href:'widgets/person/person_insert.html'
						} ]
					},{
						label:'企业管理',
						ul:[{
							label:'企业查询',
							target:'navTab',
							rel:'navTab_enterprisesearch',
							href:'widgets/enterprise/enterprise_search.html'
						},
						{
							label:'国内企业录入',
							target:'navTab',
							rel:'navTab_enterprisechinainsert',
							href:'widgets/enterprise/enterprise_insert_china.html'
						},
						{
							label:'国外企业录入',
							target:'navTab',
							rel:'navTab_enterpriseabroadinsert',
							href:'widgets/enterprise/enterprise_insert_abroad.html'
						}
						    ]
					} ]
				}, {
					label : '公司管理',
					tree : [ {
						label : '部门管理',
						ul : [ {
							label : '查看部门',
							href : 'widgets/depart/depart_search.html',
							target : 'navTab',
							rel : 'navtab_searchdepart'
						}, {
							label : '增加部门',
							href : 'widgets/depart/insert_depart.html',
							target : 'navTab',
							rel : 'navtab_insertdepart'
						} ]
					}, {
						label : '人事管理',
						ul : [ {
							label : '员工查询',
							href : 'widgets/user/user_search.html',
							target : 'navTab',
							rel : 'navTab_usersearch'
						}, {
							label : '录入员工',
							href : 'widgets/user/user_insert.html',
							target : 'navTab',
							rel : 'navTab_userinsert'
						} ]

					} ]
				} ],
				userinfo : {
					"基本信息" : [
							[ 'username', 'sex', 'birthday', 'role', 'idcard',
									'workyear' ],
							[ "姓名", "性别", "生日", "角色", "身份证", "工作年限" ] ],
					"联系方式" : [ [ 'email', 'phone', 'qq', 'address' ],
							[ "邮箱", "电话", "QQ", "地址" ] ]
				},
				_json2widget : {
					'/ReportSystem/api/pageState' : function(json) {
						var viewdata = $.view_config["role." + json.role]
								|| '没有该角色的对应界面';
						// alert(JSON.stringify(viewdata))
						// console.log(viewdata)
						var container = $('<div class="accordion" fillSpace="sidebar"></div');
						viewdata
								.forEach(function(v, i) {
									var wstr = '<div class="accordionHeader"><h2><span>Folder</span>#label</h2></div>'
											.replace('#label', v.label);
									container.append(wstr);
									$.view_config
											._load_tree(v.tree)
											.appendTo(container)
											.wrap(
													'<div class="accordionContent"></div>')// .replace('#display',i==0?'block':'none')
								})
						// console.log(container.html())
						return container;
					},
					'/ReportSystem/api/userinfo' : function(json) {
						var content = $.view_config._create_info({
							data : json,
							fieldsets : $.view_config.userinfo
						});
						var form = $('<form class="pageForm"></div>').append(
								content);
						$(
								'<button target="navTab" title="个人信息修改" href="userinfo_w.html"  rel="navtab_userinfo">修改</button>')
								.appendTo(form)
								.wrap(
										'<div class="formBar"><ul><li><div class="buttonContent"></div></div></ul></div>')
						return $('<div></div>').addClass('pageContent').append(
								form)
					}
				},
				_create_info : function(data) {
					var fieldsets = data.fieldsets;
					var data = data.data;
					if (data.sex)
						data.sex = data.sex == 0 ? "女" : "男";
					var $div = $("<div layoutH='56'></div>").addClass(
							"pageFormContent");
					for (k in fieldsets) {
						var $fieldset = $("<fieldset></fieldset>").appendTo(
								$div);
						$('<legend></legend>').text(k).appendTo($fieldset);
						fieldsets[k][0].forEach(function(name, i) {
							var $dl = $('<dl></dl>').appendTo($fieldset);
							$('<dt></dt>').text(fieldsets[k][1][i] + ":")
									.appendTo($dl);
							$('<dt></dt>').text(data[name]).appendTo($dl);
						});
					}
					return $div;
				},
				_load_tree : function(data) {
					// var $this = $(this);
					function createTree(d) {

						var $ul = $('<ul></ul>');
						// alert(JSON.stringify(data))
						if ($.type(d) != 'array')
							return $ul;
						d.forEach(function(li) {
							var $li = $('<li></li>').appendTo($ul);
							var $a = $('<a></a>').text(li.label).appendTo($li);
							if (li.href)
								$a.attr('href', li.href);
							if (li.target)
								$a.attr('target', li.target);
							if (li.rel)
								$a.attr('rel', li.rel);
							if (li.dataType)
								$a.attr('dataType', li.dataType);
							if (li.title)
								$a.attr('title', li.title);
							if (li.external)
								$a.attr('external', li.external);
							if (li.fresh)
								$a.attr('fresh', li.fresh);
							if (li.data)
								$a.attr('data', li.data);
							if (li.ul)
								createTree(li.ul).appendTo($li)
						})
						return $ul;
					}
					// $this.empty();
					return createTree(data).addClass('tree treeFolder')// .appendTo($this);
					// $this.initUI();
				},
				_doSearch : function(json) {
					var urlid = json.url.replaceAll('/', '_');
					var container = $('<div></div>');
					var formStr = '<form id="pagerForm" method="post" action="#rel#"><input type="hidden" name="pageNum" value="1" /><input type="hidden" name="numPerPage" value="#numPerPage#" /><input type="hidden" name="orderField" value="" /><input type="hidden" name="orderDirection" value="asc" /></form>'
					var form = $(
							formStr.replace('#numPerPage#', json.numPerPage))
							.appendTo(container);
					$('<div loadNow=true></div>').attr('href',
							json.url.replace('api', 'widgets') + '.html')
							.appendTo(container);
					var pageStr = '<div class="pagination" rel="#rel#" targetType="navTab" totalCount="#totalCount#" numPerPage="#numPerPage#" pageNumShown="10" currentPage="1"></div>';
					$('<div></div>').attr('id', urlid).append(
							$.view_config._createTable(json)).appendTo(
							container);

					pageStr = pageStr.replace('#totalCount#', json.totalCount)
							.replace('#numPerPage#', json.numPerPage).replace(
									'#rel#', urlid);
					$('<div class="panelBar"></div>').append(pageStr).appendTo(
							container);
					return container.html();
				},
				_createTable : function(json) {
					var searchResult = json.searchResult;
					var table = $('<table class="table" width="100%" layoutH="138"></table>');
					var columns = json.viewColumns.split(',');
					var thread = $('<thead></thead>').appendTo(table);
					var header = $('<tr></tr>').appendTo(thread);
					columns.forEach(function(c) {
						$('<th></th>').text(c).appendTo(header);
					})
					var tbody = $('<tbody></tbody>').appendTo(table)
					searchResult.forEach(function(r) {
						var tr = $('<tr></tr>').appendTo(tbody)
						columns.forEach(function(c) {
							$('<td></td>').text(r[c]).appendTo(tr);
						})
					})
					// alert(table.html())
					return table;
				},
				rend_json : function(content) {
					//alert(content)
					var json = DWZ.jsonEval(content);
					if (!json || !json.url)
						return content;
					if (json.firstSearch)
						return $.view_config._doSearch(json);
					if (json.isSearch)
						return $.view_config._createTable(json);
					var render = $.view_config._json2widget[json.url];
					if (!render)
						return content;
					return render(json);
				}

			}
		});