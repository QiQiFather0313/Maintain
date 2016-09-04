package youdene.maintain.domain;

/**
 * TCustomer entity. @author MyEclipse Persistence Tools
 */

public class TCustomer implements java.io.Serializable {

	// Fields

	private String rid;
	private String companyName;
	private String companySname;
	private String companyAddr;
	private String linkmanName;
	private String linkmanPhone;

	// Constructors

	/** default constructor */
	public TCustomer() {
	}

	/** minimal constructor */
	public TCustomer(String rid, String companyName, String companySname,
			String linkmanName, String linkmanPhone) {
		this.rid = rid;
		this.companyName = companyName;
		this.companySname = companySname;
		this.linkmanName = linkmanName;
		this.linkmanPhone = linkmanPhone;
	}

	/** full constructor */
	public TCustomer(String rid, String companyName, String companySname,
			String companyAddr, String linkmanName, String linkmanPhone) {
		this.rid = rid;
		this.companyName = companyName;
		this.companySname = companySname;
		this.companyAddr = companyAddr;
		this.linkmanName = linkmanName;
		this.linkmanPhone = linkmanPhone;
	}

	// Property accessors

	public String getRid() {
		return this.rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanySname() {
		return this.companySname;
	}

	public void setCompanySname(String companySname) {
		this.companySname = companySname;
	}

	public String getCompanyAddr() {
		return this.companyAddr;
	}

	public void setCompanyAddr(String companyAddr) {
		this.companyAddr = companyAddr;
	}

	public String getLinkmanName() {
		return this.linkmanName;
	}

	public void setLinkmanName(String linkmanName) {
		this.linkmanName = linkmanName;
	}

	public String getLinkmanPhone() {
		return this.linkmanPhone;
	}

	public void setLinkmanPhone(String linkmanPhone) {
		this.linkmanPhone = linkmanPhone;
	}

}