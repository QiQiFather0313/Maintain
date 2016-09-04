package youdene.maintain.domain;

/**
 * TAppearance entity. @author MyEclipse Persistence Tools
 */

public class TAppearance implements java.io.Serializable {

	// Fields

	private String rid;
	private TOrderBasic TOrderBasic;
	private String name;
	private String type;
	private String appearance;
	private String remark;

	// Constructors

	/** default constructor */
	public TAppearance() {
	}

	/** minimal constructor */
	public TAppearance(String rid, TOrderBasic TOrderBasic, String name,
			String type, String appearance) {
		this.rid = rid;
		this.TOrderBasic = TOrderBasic;
		this.name = name;
		this.type = type;
		this.appearance = appearance;
	}

	/** full constructor */
	public TAppearance(String rid, TOrderBasic TOrderBasic, String name,
			String type, String appearance, String remark) {
		this.rid = rid;
		this.TOrderBasic = TOrderBasic;
		this.name = name;
		this.type = type;
		this.appearance = appearance;
		this.remark = remark;
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

	public String getAppearance() {
		return this.appearance;
	}

	public void setAppearance(String appearance) {
		this.appearance = appearance;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}