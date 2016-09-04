Ext.define('basic.store.TreeEmployee', {
    extend: 'Ext.data.TreeStore',

	proxy: {
		type: 'ajax',
		url: 'basic/tree/te.txt'
	},
	
	rootVisible : false,
	
	root: {
		text: '人员管理',
		
		expanded: true
	}
});