package com.Arvind.MySqlJPA.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loginid")
public class LoginId 
{	
	@Id
	private int lanid;
	
	private String emailid;
	
	@Override
	public String toString() {
		return "LoginId [lanid=" + lanid + ", emailid=" + emailid + "]";
	}
	public int getLanid() {
		return lanid;
	}
	public void setLanid(int lanid) {
		this.lanid = lanid;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

}
