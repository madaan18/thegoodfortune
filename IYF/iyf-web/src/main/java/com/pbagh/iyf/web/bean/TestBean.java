package com.pbagh.iyf.web.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

/**
 * 
 */

/**
 * @author tarun1714
 *
 */
@ManagedBean
@ViewScoped
public class TestBean implements Serializable{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	private String name;
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public TestBean() {
		name = "Tarun";
	}
	
	public final String submit() {
		return "test";
	}

}
