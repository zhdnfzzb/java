package com.offcn.bean;

import java.io.Serializable;

public class Dog implements Serializable {
     private Integer did;
     private String dname;
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Dog [did=" + did + ", dname=" + dname + "]";
	}

}
