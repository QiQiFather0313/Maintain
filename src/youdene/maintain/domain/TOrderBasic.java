package youdene.maintain.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TOrderBasic entity. @author MyEclipse Persistence Tools
 */

public class TOrderBasic implements java.io.Serializable {

	// Fields

	private String oid;
	private String customerid;
	private String reportmanName;
	private String reportmanPhone;
	private String manageid;
	private String maintainway;
	private String maintainwayOther;
	private String receiveway;
	private String receivewayOther;
	private String componentId;
	private String componentType;
	private String componentSeq;
	private String componentLack;
	private String componentPara;
	private String componentDriver;
	private String componentScrew;
	private String componentScrap;
	private String componentSecond;
	private String orderStatus;
	private Date orderCtime;
	private Set TEngineerOrders = new HashSet(0);
	private Set TAppearances = new HashSet(0);

	// Constructors

	/** default constructor */
	public TOrderBasic() {
	}

	/** minimal constructor */
	public TOrderBasic(String oid, String customerid, String reportmanName,
			String reportmanPhone, String manageid, String maintainway,
			String receiveway, String componentId, String componentType,
			String componentSeq, String componentDriver, String componentScrap,
			String componentSecond, String orderStatus, Date orderCtime) {
		this.oid = oid;
		this.customerid = customerid;
		this.reportmanName = reportmanName;
		this.reportmanPhone = reportmanPhone;
		this.manageid = manageid;
		this.maintainway = maintainway;
		this.receiveway = receiveway;
		this.componentId = componentId;
		this.componentType = componentType;
		this.componentSeq = componentSeq;
		this.componentDriver = componentDriver;
		this.componentScrap = componentScrap;
		this.componentSecond = componentSecond;
		this.orderStatus = orderStatus;
		this.orderCtime = orderCtime;
	}

	/** full constructor */
	public TOrderBasic(String oid, String customerid, String reportmanName,
			String reportmanPhone, String manageid, String maintainway,
			String maintainwayOther, String receiveway, String receivewayOther,
			String componentId, String componentType, String componentSeq,
			String componentLack, String componentPara, String componentDriver,
			String componentScrew, String componentScrap,
			String componentSecond, String orderStatus, Date orderCtime,
			Set TEngineerOrders, Set TAppearances) {
		this.oid = oid;
		this.customerid = customerid;
		this.reportmanName = reportmanName;
		this.reportmanPhone = reportmanPhone;
		this.manageid = manageid;
		this.maintainway = maintainway;
		this.maintainwayOther = maintainwayOther;
		this.receiveway = receiveway;
		this.receivewayOther = receivewayOther;
		this.componentId = componentId;
		this.componentType = componentType;
		this.componentSeq = componentSeq;
		this.componentLack = componentLack;
		this.componentPara = componentPara;
		this.componentDriver = componentDriver;
		this.componentScrew = componentScrew;
		this.componentScrap = componentScrap;
		this.componentSecond = componentSecond;
		this.orderStatus = orderStatus;
		this.orderCtime = orderCtime;
		this.TEngineerOrders = TEngineerOrders;
		this.TAppearances = TAppearances;
	}

	// Property accessors

	public String getOid() {
		return this.oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getCustomerid() {
		return this.customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getReportmanName() {
		return this.reportmanName;
	}

	public void setReportmanName(String reportmanName) {
		this.reportmanName = reportmanName;
	}

	public String getReportmanPhone() {
		return this.reportmanPhone;
	}

	public void setReportmanPhone(String reportmanPhone) {
		this.reportmanPhone = reportmanPhone;
	}

	public String getManageid() {
		return this.manageid;
	}

	public void setManageid(String manageid) {
		this.manageid = manageid;
	}

	public String getMaintainway() {
		return this.maintainway;
	}

	public void setMaintainway(String maintainway) {
		this.maintainway = maintainway;
	}

	public String getMaintainwayOther() {
		return this.maintainwayOther;
	}

	public void setMaintainwayOther(String maintainwayOther) {
		this.maintainwayOther = maintainwayOther;
	}

	public String getReceiveway() {
		return this.receiveway;
	}

	public void setReceiveway(String receiveway) {
		this.receiveway = receiveway;
	}

	public String getReceivewayOther() {
		return this.receivewayOther;
	}

	public void setReceivewayOther(String receivewayOther) {
		this.receivewayOther = receivewayOther;
	}

	public String getComponentId() {
		return this.componentId;
	}

	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}

	public String getComponentType() {
		return this.componentType;
	}

	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}

	public String getComponentSeq() {
		return this.componentSeq;
	}

	public void setComponentSeq(String componentSeq) {
		this.componentSeq = componentSeq;
	}

	public String getComponentLack() {
		return this.componentLack;
	}

	public void setComponentLack(String componentLack) {
		this.componentLack = componentLack;
	}

	public String getComponentPara() {
		return this.componentPara;
	}

	public void setComponentPara(String componentPara) {
		this.componentPara = componentPara;
	}

	public String getComponentDriver() {
		return this.componentDriver;
	}

	public void setComponentDriver(String componentDriver) {
		this.componentDriver = componentDriver;
	}

	public String getComponentScrew() {
		return this.componentScrew;
	}

	public void setComponentScrew(String componentScrew) {
		this.componentScrew = componentScrew;
	}

	public String getComponentScrap() {
		return this.componentScrap;
	}

	public void setComponentScrap(String componentScrap) {
		this.componentScrap = componentScrap;
	}

	public String getComponentSecond() {
		return this.componentSecond;
	}

	public void setComponentSecond(String componentSecond) {
		this.componentSecond = componentSecond;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getOrderCtime() {
		return this.orderCtime;
	}

	public void setOrderCtime(Date orderCtime) {
		this.orderCtime = orderCtime;
	}

	public Set getTEngineerOrders() {
		return this.TEngineerOrders;
	}

	public void setTEngineerOrders(Set TEngineerOrders) {
		this.TEngineerOrders = TEngineerOrders;
	}

	public Set getTAppearances() {
		return this.TAppearances;
	}

	public void setTAppearances(Set TAppearances) {
		this.TAppearances = TAppearances;
	}

}