/**
 * editby: james.xu 2016.4.20
 * 
 */

// 问题类型
var data_probtype = [['01', '错误'], ['02', '建议']];

var store_probtype = new Ext.data.ArrayStore({
			fields : ['value', 'text'],
			data : data_probtype
		});

store_probtype.load();

Ext.define('basic.view.AddFeedBack', {
			extend : 'Ext.form.FormPanel',
			alias : 'widget.addfeedback',
			id : 'addfeedback',
			title : '意见反馈',
			frame : true,

			items : [{
						xtype : 'combo',
						fieldLabel : '问题类型',
						labelAlign : 'right',
						labelWidth : 70,
						id : 'addfeedback_probtype_combo',
						width : 220,
						store : store_probtype,
						emptyText : '请选择问题类型',
						mode : 'local',
						triggerAction : 'all',
						valueField : 'value',
						displayField : 'text',
						editable : false

					}, {
						xtype : 'textarea',
						id : 'addfeedback_content',
						labelAlign : 'top',
						margin : '10 5 10 5',
						fieldLabel : '反馈内容描述',
						labelHeight : 200,
						width : 500,
						height : 300
					}, {
						xtype : 'textfield',
						id : 'addfeedback_recorder',
						fieldLabel : '反馈人员',
						labelAlign : 'right',
						labelWidth : 70,
						width : 150

					}],

			buttons : [{
						text : '确定',
						action : 'yes-AddFeedBack'
					}, {
						text : '取消',
						action : 'no-AddFeedBack'
					}]

		});
