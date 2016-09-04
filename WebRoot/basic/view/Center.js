/**
 * editby: james.xu 2016.4.20
 * 
 */

Ext.define('basic.view.Center', {
			extend : 'Ext.TabPanel',
			alias : 'widget.center',
			autoScroll : false,
			id : 'center',
					
			items : [{
						xtype : 'regemployee'
					}, {
						xtype : 'regcustomer'
					}, {
						xtype : 'regwaymaintain'
					}, {
						xtype : 'regwaysend'
					}, {
						xtype : 'regwayreceive'
					}, {
						xtype : 'regwayprice'
					},{
						//xtype : 'addemployee'
					}]

		});
