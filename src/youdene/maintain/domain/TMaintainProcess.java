package youdene.maintain.domain;

import java.sql.Time;
import java.util.Date;

/**
 * TMaintainProcess entity. @author MyEclipse Persistence Tools
 */

public class TMaintainProcess implements java.io.Serializable {

	// Fields

	private String rid;
	private TEngineerOrder TEngineerOrder;
	private Date startdate;
	private Time starttime;
	private Time endtime;
	private Short workhour;
	private Date enddate;
	private String eid;
	private String description;
	private Date rdate;

	// Constructors

	/** default constructor */
	public TMaintainProcess() {
	}

	/** full constructor */
	public TMaintainProcess(String rid, TEngineerOrder TEngineerOrder,
			Date startdate, Time starttime, Time endtime, Short workhour,
			Date enddate, String eid, String description, Date rdate) {
		this.rid = rid;
		this.TEngineerOrder = TEngineerOrder;
		this.startdate = startdate;
		this.starttime = starttime;
		this.endtime = endtime;
		this.workhour = workhour;
		this.enddate = enddate;
		this.eid = eid;
		this.description = description;
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

	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Time getStarttime() {
		return this.starttime;
	}

	public void setStarttime(Time starttime) {
		this.starttime = starttime;
	}

	public Time getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Time endtime) {
		this.endtime = endtime;
	}

	public Short getWorkhour() {
		return this.workhour;
	}

	public void setWorkhour(Short workhour) {
		this.workhour = workhour;
	}

	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getEid() {
		return this.eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getRdate() {
		return this.rdate;
	}

	public void setRdate(Date rdate) {
		this.rdate = rdate;
	}

}