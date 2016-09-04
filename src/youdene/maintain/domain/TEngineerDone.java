package youdene.maintain.domain;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TEngineerDone entity. @author MyEclipse Persistence Tools
 */

public class TEngineerDone implements java.io.Serializable {

	// Fields

	private String rid;
	private TEngineerOrder TEngineerOrder;
	private Date sureSdate;
	private Timestamp sureEdate;
	private Short sureDay;
	private Date recordDate;
	private Set TMaintainChange2s = new HashSet(0);
	private Set TMaintainChanges = new HashSet(0);

	// Constructors

	/** default constructor */
	public TEngineerDone() {
	}

	/** minimal constructor */
	public TEngineerDone(String rid, TEngineerOrder TEngineerOrder,
			Date sureSdate, Timestamp sureEdate, Short sureDay, Date recordDate) {
		this.rid = rid;
		this.TEngineerOrder = TEngineerOrder;
		this.sureSdate = sureSdate;
		this.sureEdate = sureEdate;
		this.sureDay = sureDay;
		this.recordDate = recordDate;
	}

	/** full constructor */
	public TEngineerDone(String rid, TEngineerOrder TEngineerOrder,
			Date sureSdate, Timestamp sureEdate, Short sureDay,
			Date recordDate, Set TMaintainChange2s, Set TMaintainChanges) {
		this.rid = rid;
		this.TEngineerOrder = TEngineerOrder;
		this.sureSdate = sureSdate;
		this.sureEdate = sureEdate;
		this.sureDay = sureDay;
		this.recordDate = recordDate;
		this.TMaintainChange2s = TMaintainChange2s;
		this.TMaintainChanges = TMaintainChanges;
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

	public Date getSureSdate() {
		return this.sureSdate;
	}

	public void setSureSdate(Date sureSdate) {
		this.sureSdate = sureSdate;
	}

	public Timestamp getSureEdate() {
		return this.sureEdate;
	}

	public void setSureEdate(Timestamp sureEdate) {
		this.sureEdate = sureEdate;
	}

	public Short getSureDay() {
		return this.sureDay;
	}

	public void setSureDay(Short sureDay) {
		this.sureDay = sureDay;
	}

	public Date getRecordDate() {
		return this.recordDate;
	}

	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}

	public Set getTMaintainChange2s() {
		return this.TMaintainChange2s;
	}

	public void setTMaintainChange2s(Set TMaintainChange2s) {
		this.TMaintainChange2s = TMaintainChange2s;
	}

	public Set getTMaintainChanges() {
		return this.TMaintainChanges;
	}

	public void setTMaintainChanges(Set TMaintainChanges) {
		this.TMaintainChanges = TMaintainChanges;
	}

}