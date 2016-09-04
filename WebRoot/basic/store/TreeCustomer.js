Ext.define('basic.store.TreeCustomer', {
    extend: 'Ext.data.TreeStore',

	proxy: {
		type: 'ajax',
		url: 'basic/tree/tc.txt'
	},
	
	rootVisible : false,
	
	root: {
		text: '客户管理',
		
		expanded: true
	}
});