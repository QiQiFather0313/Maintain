package youdene.maintain.domain;

/**
 * TComponent entity. @author MyEclipse Persistence Tools
 */

public class TComponent implements java.io.Serializable {

	// Fields

	private String rid;
	private String name;
	private String description;

	// Constructors

	/** default constructor */
	public TComponent() {
	}

	/** minimal constructor */
	public TComponent(String rid, String name) {
		this.rid = rid;
		this.name = name;
	}

	/** full constructor */
	public TComponent(String rid, String name, String description) {
		this.rid = rid;
		this.name = name;
		this.description = description;
	}

	// Property accessors

	public String getRid() {
		return this.rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}