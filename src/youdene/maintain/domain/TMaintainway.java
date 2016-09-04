package youdene.maintain.domain;

/**
 * TMaintainway entity. @author MyEclipse Persistence Tools
 */

public class TMaintainway implements java.io.Serializable {

	// Fields

	private String rid;
	private String way;
	private String description;

	// Constructors

	/** default constructor */
	public TMaintainway() {
	}

	/** minimal constructor */
	public TMaintainway(String rid, String way) {
		this.rid = rid;
		this.way = way;
	}

	/** full constructor */
	public TMaintainway(String rid, String way, String description) {
		this.rid = rid;
		this.way = way;
		this.description = description;
	}

	// Property accessors

	public String getRid() {
		return this.rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public String getWay() {
		return this.way;
	}

	public void setWay(String way) {
		this.way = way;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}