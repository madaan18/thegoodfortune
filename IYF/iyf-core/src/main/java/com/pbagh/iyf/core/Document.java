/**
 * 
 */
package com.pbagh.iyf.core;

import java.io.Serializable;

/**
 * The Class Document.
 *
 * @author tarun1714
 */
public class Document implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	private Integer id;
	
	/** The name. */
	private String name;
	
	/** The type. */
	private String type;
	
	/** The author. */
	private String author;
	
	/** The Parent doc id. */
	private Integer parentDocID;
	
	/** The status. */
	private String status;
	
	/** The issue number. */
	private String issueNumber;

	/**
	 * @return the issueNumber
	 */
	public String getIssueNumber() {
		return issueNumber;
	}

	/**
	 * @param issueNumber the issueNumber to set
	 */
	public void setIssueNumber(String issueNumber) {
		this.issueNumber = issueNumber;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Gets the author.
	 *
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the author.
	 *
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * Gets the parent doc id.
	 *
	 * @return the parentDocID
	 */
	public Integer getParentDocID() {
		return parentDocID;
	}

	/**
	 * Sets the parent doc id.
	 *
	 * @param parentDocID the parentDocID to set
	 */
	public void setParentDocID(Integer parentDocID) {
		this.parentDocID = parentDocID;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Gets the serialversionuid.
	 *
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
