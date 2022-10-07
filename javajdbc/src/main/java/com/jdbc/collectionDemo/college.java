package com.jdbc.collectionDemo;

public class college{
public college() {
		super();
		// TODO Auto-generated constructor stub
	}
public college(int cid, String cname, String ccity, String ccourse) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ccity = ccity;
		this.ccourse = ccourse;
	}
public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCcity() {
		return ccity;
	}
	public void setCcity(String ccity) {
		this.ccity = ccity;
	}
	public String getCcourse() {
		return ccourse;
	}
	public void setCcourse(String ccourse) {
		this.ccourse = ccourse;
	}
 int cid;
 String cname;
 String ccity;
 String ccourse;

}
