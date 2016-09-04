/**
 * editby: james.xu 2016.4.20
 * 
 */

Ext.define('basic.view.North', {
			extend : 'Ext.Container',
			alias : 'widget.north',
			layout : 'border',
			autoScroll : false,
		
			items : [{
						region : 'north',
						height : '55%',
						html : '<center><h2>维修管理系统</h2></center>'

					}, {
						region : 'center',
						xtype : 'toolbar',
						items : [{
									text : '系统日志',
									id : 'tripsys_log_north',
									action : 'browserlog-tripsys'
								}, {
									text : '问题反馈',
									action : 'feedback-tripsys'
								}, {
									text : '帮助文档',
									action : 'helpdoc-tripsys'
								},'->', {
									xtype : 'label',
									id : 'north_login_username',
									text : "",
									margin : '15 0 0 70'
								}, {
									xtype : 'tbspacer',
									width : 20
								}, {
									text : '退出系统',
									action : 'logout'
								}, {
									xtype : 'tbspacer',
									width : 20
								}]

					}]

		});