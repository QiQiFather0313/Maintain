/**
 * 
 */

Ext.define('basic.store.RegCustomer', {

			extend : 'Ext.data.Store',
			requires : 'basic.model.RegCustomer',
			model : 'basic.model.RegCustomer',
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
