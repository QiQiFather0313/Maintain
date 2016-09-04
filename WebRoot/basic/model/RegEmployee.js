/**
 * 
 */
Ext.define('basic.model.RegEmployee',{
	extend:'Ext.data.Model',
	fields:[
		
		{name:'rid',type:'string'}, 
		{name:'name',type:'string'},
		
		{name:'phone',type:'string'},
		{name:'password',type:'string'},
		
		{name:'sex',type:'string'},
		{name:'cardid',type:'string'},
		
		{name:'role',type:'string'}	
				
		]
		
});