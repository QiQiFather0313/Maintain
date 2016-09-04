package youdene.maintain.domain;

import java.sql.Timestamp;

/**
 * TLog entity. @author MyEclipse Persistence Tools
 */

public class TLog implements java.io.Serializable {

	// Fields

	private Long id;
	private Timestamp date;
	private String logger;
	private String level;
	private String message;

	// Constructors

	/** default constructor */
	public TLog() {
	}

	/** full constructor */
	public TLog(Long id, Timestamp date, String logger, String level,
			String message) {
		this.id = id;
		this.date = date;
		this.logger = logger;
		this.level = level;
		this.message = message;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getLogger() {
		return this.logger;
	}

	public void setLogger(String logger) {
		this.logger = logger;
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}