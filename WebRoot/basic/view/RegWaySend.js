/**
 * 组织结构的界面： 在该界面中需要的功能为： 1) 增加机构，以及机构增删查改； 2) 设定机构的隶属关系； 3)
 * 设定机构隶属关系是应当先设定父机构，再设定子机构。
 * 
 * 界面是由TreePanel组成，能够显示出部门的隶属关系。
 * 
 * 由徐喆编辑与20150519
 * 
 */
var req = new Ext.grid.RowNumberer();

Ext.define('basic.view.RegWaySend', {
			extend : 'Ext.grid.GridPanel',
			alias : 'widget.regwaysend',
			id : 'regwaysend',
			title : '发货方式',
			iconCls : 'register-waysend',
		
			columns : [req, {
						header : '注册编号',
						dataIndex : 'rid'
					}, {
						header : '发货方式',
						dataIndex : 'way'
					}, {
						header : '说明',
						dataIndex : 'description'
					}],

			autoHeight : true,
			forceFit : true,
			store : 'RegWaySend',
			tbar : [{
						xtype : 'tbspacer',
						width : 5
					}, {
						text : '新建',
						action : 'add-waysend'
					}, {
						xtype : 'tbspacer',
						width : 5
					}, {
						text : '编辑',
						action : 'edit-waysend'
					}, {
						xtype : 'tbspacer',
						width : 5
					}, {
						text : '删除',
						action : 'del-waysend'
					}],

			bbar : {
				xtype : 'pagingtoolbar',
				pageSize : 25,
				store : 'RegWaySend',
				displayInfo : true
			}

		});
