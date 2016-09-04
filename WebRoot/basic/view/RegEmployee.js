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

function renderSex(value) {

	if (value == "1") {
		return "男";
	} else if (value == "2") {
		return "女";
	} else {
		return "男";
	}

}

Ext.define('basic.view.RegEmployee', {
			extend : 'Ext.grid.GridPanel',
			alias : 'widget.regemployee',
			id : 'regemployee',
			title : '人员注册',
			iconCls : 'register-employee',
		
			columns : [req, {
						header : '注册编号',
						dataIndex : 'rid'
					}, {
						header : '员工姓名',
						dataIndex : 'name'
					}, {
						header : '电话号码',
						dataIndex : 'phone'
					}, {
						header : '密码',
						dataIndex : 'password'
					}, {
						header : '性别',
						dataIndex : 'sex',
						
						renderer : renderSex
						
					}, {
						header : '身份证',
						dataIndex : 'cardid'
					}, {
						header : '角色',
						dataIndex : 'role'
					}],

			autoHeight : true,
			forceFit : true,
			store : 'RegEmployee',
			tbar : [{
						xtype : 'tbspacer',
						width : 5
					}, {
						text : '新建',
						action : 'add-employee'
					}, {
						xtype : 'tbspacer',
						width : 5
					}, {
						text : '编辑',
						action : 'edit-employee'
					}, {
						xtype : 'tbspacer',
						width : 5
					}, {
						text : '删除',
						action : 'del-employee'
					}],

			bbar : {
				xtype : 'pagingtoolbar',
				pageSize : 25,
				store : 'RegEmployee',
				displayInfo : true
			}

		});
