package youdene.maintain.domain;

import java.util.Date;

/**
 * TFeedback entity. @author MyEclipse Persistence Tools
 */

public class TFeedback implements java.io.Serializable {

	// Fields

	private String rid;
	private String type;
	private String content;
	private Date recordDate;
	private String recorder;

	// Constructors

	/** default constructor */
	public TFeedback() {
	}

	/** full constructor */
	public TFeedback(String rid, String type, String content, Date recordDate,
			String recorder) {
		this.rid = rid;
		this.type = type;
		this.content = content;
		this.recordDate = recordDate;
		this.recorder = recorder;
	}

	// Property accessors

	public String getRid() {
		return this.rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRecordDate() {
		return this.recordDate;
	}

	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}

	public String getRecorder() {
		return this.recorder;
	}

	public void setRecorder(String recorder) {
		this.recorder = recorder;
	}

}