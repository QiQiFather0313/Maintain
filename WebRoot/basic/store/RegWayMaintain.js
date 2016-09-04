/**
 * 
 */

Ext.define('basic.store.RegWayMaintain', {

			extend : 'Ext.data.Store',
			requires : 'basic.model.RegWayMaintain',
			model : 'basic.model.RegWayMaintain',
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
