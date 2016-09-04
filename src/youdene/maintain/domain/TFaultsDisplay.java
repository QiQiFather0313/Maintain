package youdene.maintain.domain;

import java.util.Date;

/**
 * TFaultsDisplay entity. @author MyEclipse Persistence Tools
 */

public class TFaultsDisplay implements java.io.Serializable {

	// Fields

	private String rid;
	private TEngineerOrder TEngineerOrder;
	private String faultsDisplay;
	private String remark;
	private Date rdate;

	// Constructors

	/** default constructor */
	public TFaultsDisplay() {
	}

	/** minimal constructor */
	public TFaultsDisplay(String rid, TEngineerOrder TEngineerOrder,
			String faultsDisplay, Date rdate) {
		this.rid = rid;
		this.TEngineerOrder = TEngineerOrder;
		this.faultsDisplay = faultsDisplay;
		this.rdate = rdate;
	}

	/** full constructor */
	public TFaultsDisplay(String rid, TEngineerOrder TEngineerOrder,
			String faultsDisplay, String remark, Date rdate) {
		this.rid = rid;
		this.TEngineerOrder = TEngineerOrder;
		this.faultsDisplay = faultsDisplay;
		this.remark = remark;
		this.rdate = rdate;
	}

	// Property accessors

	public String getRid() {
		return this.rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public TEngineerOrder getTEngineerOrder() {
		return this.TEngineerOrder;
	}

	public void setTEngineerOrder(TEngineerOrder TEngineerOrder) {
		this.TEngineerOrder = TEngineerOrder;
	}

	public String getFaultsDisplay() {
		return this.faultsDisplay;
	}

	public void setFaultsDisplay(String faultsDisplay) {
		this.faultsDisplay = faultsDisplay;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getRdate() {
		return this.rdate;
	}

	public void setRdate(Date rdate) {
		this.rdate = rdate;
	}

}