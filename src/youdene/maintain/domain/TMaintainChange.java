package youdene.maintain.domain;

/**
 * TMaintainChange entity. @author MyEclipse Persistence Tools
 */

public class TMaintainChange implements java.io.Serializable {

	// Fields

	private String rid;
	private TEngineerDone TEngineerDone;
	private String componentName;
	private String oldtype;
	private String oldseq;
	private String newtype;
	private String newseq;

	// Constructors

	/** default constructor */
	public TMaintainChange() {
	}

	/** full constructor */
	public TMaintainChange(String rid, TEngineerDone TEngineerDone,
			String componentName, String oldtype, String oldseq,
			String newtype, String newseq) {
		this.rid = rid;
		this.TEngineerDone = TEngineerDone;
		this.componentName = componentName;
		this.oldtype = oldtype;
		this.oldseq = oldseq;
		this.newtype = newtype;
		this.newseq = newseq;
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

	public String getComponentName() {
		return this.componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	public String getOldtype() {
		return this.oldtype;
	}

	public void setOldtype(String oldtype) {
		this.oldtype = oldtype;
	}

	public String getOldseq() {
		return this.oldseq;
	}

	public void setOldseq(String oldseq) {
		this.oldseq = oldseq;
	}

	public String getNewtype() {
		return this.newtype;
	}

	public void setNewtype(String newtype) {
		this.newtype = newtype;
	}

	public String getNewseq() {
		return this.newseq;
	}

	public void setNewseq(String newseq) {
		this.newseq = newseq;
	}

}