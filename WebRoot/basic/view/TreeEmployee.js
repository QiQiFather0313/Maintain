
Ext.define('basic.view.TreeEmployee', {
    extend: 'Ext.tree.TreePanel',
    alias: 'widget.treeemployee',
    
    id : 'treeemployee',
	
	title: '人员管理',
	
	rootVisible : false,
	
	store: 'TreeEmployee'
	
});
