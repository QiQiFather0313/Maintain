package youdene.maintain.domain;

/**
 * TMaintainChange2 entity. @author MyEclipse Persistence Tools
 */

public class TMaintainChange2 implements java.io.Serializable {

	// Fields

	private String rid;
	private TEngineerDone TEngineerDone;
	private String name;
	private String type;
	private Short num;

	// Constructors

	/** default constructor */
	public TMaintainChange2() {
	}

	/** full constructor */
	public TMaintainChange2(String rid, TEngineerDone TEngineerDone,
			String name, String type, Short num) {
		this.rid = rid;
		this.TEngineerDone = TEngineerDone;
		this.name = name;
		this.type = type;
		this.num = num;
	}

	// Property accessors

	public String getRid() {
		return this.rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public TEngineerDone getTEngineerDone() {
		return this.TEngineerDone;
	}

	public void setTEngineerDone(TEngineerDone TEngineerDone) {
		this.TEngineerDone = TEngineerDone;
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

	public Short getNum() {
		return this.num;
	}

	public void setNum(Short num) {
		this.num = num;
	}

}