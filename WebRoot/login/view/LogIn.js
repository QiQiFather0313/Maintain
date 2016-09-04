/**
 * editby: james.xu 2016.4.20
 * 
 */

var baiscpath = document.getElementById("g_baiscpath").value;
var login_url = baiscpath + "j_spring_security_check";

Ext.define('login.view.LogIn', {
			extend : 'Ext.FormPanel',
			alias : 'widget.login',
			id : 'login',
			frame : true,
			margin : '10 10 10 10',
			//margin : '0 0 0 0',
			autoScroll : true,
			
			standardSubmit : true,
			
			url:login_url,		
			
			// 建立一个登陆的view
			items : [{
						xtype : 'textfield',
						id : 'login_j_username',
						name : 'j_username',
						fieldLabel : '用户名 :',
						labelAlign : 'right',
						margin : '10 0 10 0',
						labelWidth : 70

					}, {
						xtype : 'textfield',
						id :  'login_j_password',
						name : 'j_password',
						fieldLabel : '密码 :',
						inputType : 'password',
						labelAlign : 'right',
						margin : '10 0 20 0',
						labelWidth : 70
					},{
						xtype: 'label',
						id :  'login_error_message',
						text: "",
						margin : '15 0 0 70'
					}],
					
			buttons : [{
				text : '确定',
				handler: function(){
					
					Ext.getCmp("login").getForm().submit({
						method:"POST"
					});
				}
			}]		

		});
