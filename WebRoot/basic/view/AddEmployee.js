/**
 * editby: james.xu 2016.4.20
 * 
 */

// 角色类型
var data_roletype = [['01', '业务主管'], ['02', '业务经理'],['03', '工程师']];

var store_roletype = new Ext.data.ArrayStore({
			fields : ['value', 'text'],
			data : data_roletype
		});

store_roletype.load();

// 性别类型
var data_sextype = [['1', '男'], ['2', '女']];

var store_sextype = new Ext.data.ArrayStore({
			fields : ['value', 'text'],
			data : data_sextype
		});

store_sextype.load();

Ext.define('basic.view.AddEmployee', {
			extend : 'Ext.form.FormPanel',
			alias : 'widget.addemployee',
			id : 'addemployee',
			title : '添加员工',
			frame : true,

			items : [ {
						xtype : 'textfield',
						id : 'addemployee_name',
						fieldLabel : '员工姓名',
						labelAlign : 'right',
						labelWidth : 70

					}, {
						xtype : 'textfield',
						id : 'addemployee_phone',
						fieldLabel : '联系方式',
						labelAlign : 'right',
						labelWidth : 70

					}, {
						xtype : 'textfield',
						id : 'addemployee_password',
						fieldLabel : '登录密码',
						labelAlign : 'right',
						labelWidth : 70

					}, {
						xtype : 'combo',
						fieldLabel : '性别',
						labelAlign : 'right',
						labelWidth : 70,
						id : 'addemployee_sex',
						width : 220,
						store : store_sextype,
						emptyText : '请选择角色',
						mode : 'local',
						triggerAction : 'all',
						valueField : 'value',
						displayField : 'text',
						editable : false

					}, {
						xtype : 'textfield',
						id : 'addemployee_cardid',
						fieldLabel : '身份证号码',
						labelAlign : 'right',
						labelWidth : 70

					}, {
						xtype : 'textfield',
						id : 'addemployee_email',
						fieldLabel : '邮箱',
						labelAlign : 'right',
						labelWidth : 70

					}, {
						xtype : 'combo',
						fieldLabel : '角色',
						labelAlign : 'right',
						labelWidth : 70,
						id : 'addemployee_roletype',
						width : 220,
						store : store_roletype,
						emptyText : '请选择角色',
						mode : 'local',
						triggerAction : 'all',
						valueField : 'value',
						displayField : 'text',
						editable : false

					}],

			buttons : [{
						text : '保存',
						action : 'save-addemployee'
					}, {
						text : '退出',
						action : 'exit-addemployee'
					}]

		});
