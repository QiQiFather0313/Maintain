/**
 * editby: james.xu 2016.4.20
 * 
 */


Ext.define('basic.view.West', {
			extend : 'Ext.Panel',
			alias : 'widget.west',
			layout : 'accordion',
			autoScroll : false,
			items : [{
				xtype : 'treeemployee'
			}, {
				xtype : 'treecustomer'
			}, {
				xtype : 'treebusiness'
			}]
					
		});
		
		