package com.my.test.demo7;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "td_b_login")
public class Login {
	 @Id
	    @GeneratedValue
	    private Integer id;
	    private String uname;
	    private String pwd;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
		}
		public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}

}
