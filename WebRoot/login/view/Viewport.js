/**
 * editby: james.xu 2016.4.20
 * 
 */
Ext.define('login.view.Viewport', {
			extend : 'Ext.container.Viewport',

			layout : 'border',

			requires : [
					'login.view.Center',
					'login.view.LogIn'
					],

			initComponent : function() {
				this.items = [{
							region : 'center',
							split : true,
							xtype : 'center'
						}];

				this.callParent();
			}
		});
