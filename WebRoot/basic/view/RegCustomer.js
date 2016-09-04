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

Ext.define('basic.view.RegCustomer', {
			extend : 'Ext.grid.GridPanel',
			alias : 'widget.regcustomer',
			id : 'regcustomer',
			title : '客户注册',
			iconCls : 'register-customer',
	
			columns : [req, {
						header : '注册编号',
						dataIndex : 'rid'
					}, {
						header : '公司名称',
						dataIndex : 'companyName'
					}, {
						header : '公司简称',
						dataIndex : 'companySname'
					}, {
						header : '公司地址',
						dataIndex : 'companyAddr'
					}, {
						header : '联系人姓名',
						dataIndex : 'linkmanName'
						
					}, {
						header : '联系人电话',
						dataIndex : 'linkmanPhone'
					}],

			autoHeight : true,
			forceFit : true,
			store : 'RegCustomer',
			tbar : [{
						xtype : 'tbspacer',
						width : 5
					}, {
						text : '新建',
						action : 'add-customer'
					}, {
						xtype : 'tbspacer',
						width : 5
					}, {
						text : '编辑',
						action : 'edit-customer'
					}, {
						xtype : 'tbspacer',
						width : 5
					}, {
						text : '删除',
						action : 'del-customer'
					}],

			bbar : {
				xtype : 'pagingtoolbar',
				pageSize : 25,
				store : 'RegCustomer',
				displayInfo : true
			}

		});
