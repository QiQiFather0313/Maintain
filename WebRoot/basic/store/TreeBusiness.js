Ext.define('basic.store.TreeBusiness', {
    extend: 'Ext.data.TreeStore',

	proxy: {
		type: 'ajax',
		url: 'basic/tree/tb.txt'
	},
	
	rootVisible : false,
	
	root: {
		text: '业务管理',
		
		expanded: true
	}
});