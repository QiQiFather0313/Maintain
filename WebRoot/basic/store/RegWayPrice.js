/**
 * 
 */

Ext.define('basic.store.RegWayPrice', {

			extend : 'Ext.data.Store',
			requires : 'basic.model.RegWayPrice',
			model : 'basic.model.RegWayPrice',
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
