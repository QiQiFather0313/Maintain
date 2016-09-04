/**
 * editby: james.xu 2016.4.20
 * 
 */
 
 Ext.define('basic.view.South', {
			extend : 'Ext.Container',
			alias : 'widget.south',
			layout : 'border',
			id : 'south',
			autoScroll : false,
			items : [{
						region : 'center',
						xtype:'toolbar',
						items:['->',
						'<html> copyright 1.0.0 @ youdene </html>'
						]
					}]

		});