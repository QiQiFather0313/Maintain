package youdene.maintain.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TEngineerOrder entity. @author MyEclipse Persistence Tools
 */

public class TEngineerOrder implements java.io.Serializable {

	// Fields

	private String rid;
	private TOrderBasic TOrderBasic;
	private String eid;
	private Date orderRtime;
	private Set TMaintainProcesses = new HashSet(0);
	private Set TDismantles = new HashSet(0);
	private Set TFaultsDisplaies = new HashSet(0);
	private Set TEngineerDones = new HashSet(0);

	// Constructors

	/** default constructor */
	public TEngineerOrder() {
	}

	/** minimal constructor */
	public TEngineerOrder(String rid, TOrderBasic TOrderBasic, String eid,
			Date orderRtime) {
		this.rid = rid;
		this.TOrderBasic = TOrderBasic;
		this.eid = eid;
		this.orderRtime = orderRtime;
	}

	/** full constructor */
	public TEngineerOrder(String rid, TOrderBasic TOrderBasic, String eid,
			Date orderRtime, Set TMaintainProcesses, Set TDismantles,
			Set TFaultsDisplaies, Set TEngineerDones) {
		this.rid = rid;
		this.TOrderBasic = TOrderBasic;
		this.eid = eid;
		this.orderRtime = orderRtime;
		this.TMaintainProcesses = TMaintainProcesses;
		this.TDismantles = TDismantles;
		this.TFaultsDisplaies = TFaultsDisplaies;
		this.TEngineerDones = TEngineerDones;
	}

	// Property accessors

	public String getRid() {
		return this.rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public TOrderBasic getTOrderBasic() {
		return this.TOrderBasic;
	}

	public void setTOrderBasic(TOrderBasic TOrderBasic) {
		this.TOrderBasic = TOrderBasic;
	}

	public String getEid() {
		return this.eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public Date getOrderRtime() {
		return this.orderRtime;
	}

	public void setOrderRtime(Date orderRtime) {
		this.orderRtime = orderRtime;
	}

	public Set getTMaintainProcesses() {
		return this.TMaintainProcesses;
	}

	public void setTMaintainProcesses(Set TMaintainProcesses) {
		this.TMaintainProcesses = TMaintainProcesses;
	}

	public Set getTDismantles() {
		return this.TDismantles;
	}

	public void setTDismantles(Set TDismantles) {
		this.TDismantles = TDismantles;
	}

	public Set getTFaultsDisplaies() {
		return this.TFaultsDisplaies;
	}

	public void setTFaultsDisplaies(Set TFaultsDisplaies) {
		this.TFaultsDisplaies = TFaultsDisplaies;
	}

	public Set getTEngineerDones() {
		return this.TEngineerDones;
	}

	public void setTEngineerDones(Set TEngineerDones) {
		this.TEngineerDones = TEngineerDones;
	}

}