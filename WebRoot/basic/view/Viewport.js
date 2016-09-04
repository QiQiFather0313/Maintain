/**
 * editby: james.xu 2016.4.20
 * 
 */
Ext.define('basic.view.Viewport', {
			extend : 'Ext.container.Viewport',

			layout : 'border',

			requires : [
			
					'basic.view.North',
					
					'basic.view.TreeBusiness',
					'basic.view.TreeCustomer',
					'basic.view.TreeEmployee',
					'basic.view.West',
					
					'basic.view.South',
					
					'basic.view.AddEmployee',
					'basic.view.RegEmployee',
					
					'basic.view.RegCustomer',
					'basic.view.RegWayMaintain',
					'basic.view.RegWaySend',
					'basic.view.RegWayReceive',
					'basic.view.RegWayPrice',
					'basic.view.Center'
					],

			initComponent : function() {
				this.items = [{
							region : 'north',
							height : '12%',
							xtype : 'north'
						}, {
							region : 'west',
							width : '15%',
							split : true,
							xtype : 'west'
						}, {
							region : 'center',
							split : true,
							xtype : 'center'
						}, {
							region : 'south',
							height : '5%',
							xtype : 'south'
						}];

				this.callParent();
			}
		});
