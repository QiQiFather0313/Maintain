/**
 * 
 */

Ext.define('basic.store.RegEmployee', {

			extend : 'Ext.data.Store',
			requires : 'basic.model.RegEmployee',
			model : 'basic.model.RegEmployee',
			pageSize : 25,

			autoLoad : false,

			proxy : {
				//url : 'Trip/TaskBasic/getMyPubTaskTripBasicByUser.do',
				type : "ajax",
				method : 'POST',
				reader : {
					type : 'json',
					totalProperty : 'totalProperty',
					root : 'root'
				}			
			}

		});
