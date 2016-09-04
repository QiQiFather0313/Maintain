package youdene.maintain.domain;

import java.util.Date;

/**
 * TDismantle entity. @author MyEclipse Persistence Tools
 */

public class TDismantle implements java.io.Serializable {

	// Fields

	private String rid;
	private TEngineerOrder TEngineerOrder;
	private String name;
	private String type;
	private String remark;
	private Date rdate;

	// Constructors

	/** default constructor */
	public TDismantle() {
	}

	/** minimal constructor */
	public TDismantle(String rid, TEngineerOrder TEngineerOrder, String name,
			String type, Date rdate) {
		this.rid = rid;
		this.TEngineerOrder = TEngineerOrder;
		this.name = name;
		this.type = type;
		this.rdate = rdate;
	}

	/** full constructor */
	public TDismantle(String rid, TEngineerOrder TEngineerOrder, String name,
			String type, String remark, Date rdate) {
		this.rid = rid;
		this.TEngineerOrder = TEngineerOrder;
		this.name = name;
		this.type = type;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
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