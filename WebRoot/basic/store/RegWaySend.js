/**
 * 
 */

Ext.define('basic.store.RegWaySend', {

			extend : 'Ext.data.Store',
			requires : 'basic.model.RegWaySend',
			model : 'basic.model.RegWaySend',
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
