// 添加员工
var aw_addemployee = new Ext.Window({
			
			layout : 'fit',
			width : 300,
			height : 300,
			modal : true,

			closeAction : 'hide',
			closable : false,

			items : [{
						xtype : 'addemployee'
					}]

		});
		

Ext.define('basic.controller.RegEmployee', {
			extend : 'Ext.app.Controller',

			refs : [{
						ref : 'regemployee',
						selector : 'regemployee'
					}],

			models : ['RegEmployee'],
			stores : ['RegEmployee'],

			init : function() {
				this.control({
							'regemployee' : {
								activate : this.onActivate
							},

							'regemployee button[action=add-employee]' : {
								click : this.onAddEmployee
							},
							
							'addemployee button[action=exit-addemployee]' : {
								click : this.onExitAddEmployee
							},
							
							'addemployee button[action=save-addemployee]' : {
								click : this.onSaveAddEmployee
							},
							
							'regemployee button[action=add-employee]' : {
								click : this.onAddEmployee
							},
							
							'regemployee button[action=add-employee]' : {
								click : this.onAddEmployee
							}
							

						});
			},

			onActivate : function() {

			},

			onAddEmployee : function() {
				aw_addemployee.show();
			},
			
			onExitAddEmployee : function() {
				aw_addemployee.hide();
			},
			
			onSaveAddEmployee : function() {
				aw_addemployee.hide();
			}

			
		});
