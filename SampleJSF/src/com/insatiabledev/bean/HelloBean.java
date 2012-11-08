package com.insatiabledev.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

 
@ManagedBean
@SessionScoped
public class HelloBean  {
 
	private String name;
	private static Logger logger = Logger.getLogger(HelloBean.class);
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
	
		this.name = name;
		logger.info("this is a sample log message.");
	}
}