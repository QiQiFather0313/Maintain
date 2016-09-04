package youdene.maintain.domain;

/**
 * TEmployee entity. @author MyEclipse Persistence Tools
 */

public class TEmployee implements java.io.Serializable {

	// Fields

	private String rid;
	private String name;
	private String phone;
	private String password;
	private String sex;
	private String cardid;
	private String role;
	private String enabled;

	// Constructors

	/** default constructor */
	public TEmployee() {
	}

	/** minimal constructor */
	public TEmployee(String rid, String name, String phone, String password,
			String sex, String role, String enabled) {
		this.rid = rid;
		this.name = name;
		this.phone = phone;
		this.password = password;
		this.sex = sex;
		this.role = role;
		this.enabled = enabled;
	}

	/** full constructor */
	public TEmployee(String rid, String name, String phone, String password,
			String sex, String cardid, String role, String enabled) {
		this.rid = rid;
		this.name = name;
		this.phone = phone;
		this.password = password;
		this.sex = sex;
		this.cardid = cardid;
		this.role = role;
		this.enabled = enabled;
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

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCardid() {
		return this.cardid;
	}

	public void setCardid(String cardid) {
		this.cardid = cardid;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEnabled() {
		return this.enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

}