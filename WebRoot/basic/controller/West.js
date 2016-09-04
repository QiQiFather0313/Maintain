Ext.define('basic.controller.West', {
			extend : 'Ext.app.Controller',

			views : ['West', 'Center'],

			refs : [{
						ref : 'west',
						selector : 'west'
					}, {
						ref : 'center',
						selector : 'center'
					}],

			init : function() {
				this.control({
							'west' : {
								beforerender : this.onBeforeRender
							},

							'west treepanel' : {
								itemclick : this.onClick
							}
						});
			},

			onBeforeRender : function() {
			},

			onClick : function(view, record) {
				var tabs = this.getCenter();
				tabs.items.each(function(data, index) {
							if (data.iconCls == record.get('iconCls')) {
								tabs.setActiveTab(index);
								return false;
							}
						});
			}

		});
