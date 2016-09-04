/**
 * 
 */

Ext.define('basic.store.RegWayReceive', {

			extend : 'Ext.data.Store',
			requires : 'basic.model.RegWayReceive',
			model : 'basic.model.RegWayReceive',
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
