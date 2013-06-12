/**
 * 
 */
package com.pbagh.iyf.web.bean;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.pbagh.iyf.core.Document;


/**
 * @author tarun1714
 *
 */
@ManagedBean(name = "documentBean")
@ViewScoped
public class DocumentManagedBean implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	private List<Document> documents;
	
	public DocumentManagedBean() {
		init();
	}
	
	public void init() {
		createDocumentList();
	}

	private void createDocumentList() {
		documents = new ArrayList<Document>();
		Document document;
		
		for (int i=1; i<= 30; i++) {
			document = new Document();
			document.setId(i);
			document.setName("Name " + i);
			document.setAuthor("Author");
			document.setType("Article");
			document.setStatus("2");
			document.setParentDocID(i);
			document.setIssueNumber("3");
			documents.add(document);
		}
		
	}

	/**
	 * @return the documents
	 */
	public List<Document> getDocuments() {
		return documents;
	}

	/**
	 * @param documents the documents to set
	 */
	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
	
}
