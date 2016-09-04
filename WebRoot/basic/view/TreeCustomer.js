
Ext.define('basic.view.TreeCustomer', {
    extend: 'Ext.tree.TreePanel',
    alias: 'widget.treecustomer',
    
    id : 'treecustomer',
	
	title: '客户管理',
	
	rootVisible : false,
	
	store: 'TreeCustomer'
	
});
