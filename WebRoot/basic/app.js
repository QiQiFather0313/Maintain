/**
 * editby: james.xu 2016.6.15
 * 
 * 寮�缂栧啓鍑哄樊绯荤粺锛岀洰鍓嶅悗鍙版暟鎹簱閮ㄥ垎宸茬粡璁捐瀹屾瘯銆�
 * 
 * 
 * 
 */

Ext.application({
			name : 'basic',
			appFolder : 'basic',
			autoCreateViewport : true,

			models : ['TreeBusiness', 'TreeCustomer', 'TreeEmployee',
					'RegEmployee', 'RegCustomer', 'RegWayMaintain',
					'RegWaySend', 'RegWayReceive', 'RegWayPrice'],

			stores : ['TreeBusiness', 'TreeCustomer', 'TreeEmployee',
					'RegEmployee', 'RegCustomer', 'RegWayMaintain',
					'RegWaySend', 'RegWayReceive', 'RegWayPrice'],

			controllers : ['West','RegEmployee']

		});
