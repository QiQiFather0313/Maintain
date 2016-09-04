/**
 * editby: james.xu 2016.4.20
 * 
 */

var aw_login = new Ext.Window({
			layout : 'fit',
			width : 300,
			height : 200,
			modal : true,

			closeAction : 'hide',
			closable : false,

			items : [{
						xtype : 'login'
					}]

		});
		
var errmsg = document.getElementById("g_login_error").value;


Ext.define('login.controller.Center', {
	extend : 'Ext.app.Controller',

	views : ['Center'],

	refs : [{
				ref : 'center',
				selector : 'center'
			}],

	init : function() {
		this.control({
					'center' : {
						afterrender : this.onAfterrender
					}
					
				});
	},

	onAfterrender : function() {
		
		var errmsgtxt = "请您输入用户名和密码";
		
		if(errmsg==1){
			errmsgtxt = "用户名密码不正确";
		}
		
		if(errmsg==2){
			errmsgtxt = "您的权限不够";
		}
		
		if(errmsg==3){
			errmsgtxt = "认证过期，请重新登录";
		}
		
		Ext.getCmp('login_error_message').setText(errmsgtxt);
		
		aw_login.show();
	}

});
