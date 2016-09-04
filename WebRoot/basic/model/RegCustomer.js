/**
 * 
 */
Ext.define('basic.model.RegCustomer',{
	extend:'Ext.data.Model',
	fields:[
	
		{name:'rid',type:'string'}, 
		{name:'companyName',type:'string'},
		
		{name:'companySname',type:'string'},
		{name:'companyAddr',type:'string'},
		
		{name:'linkmanName',type:'string'},
		{name:'linkmanPhone',type:'string'}
				
		]
		
});