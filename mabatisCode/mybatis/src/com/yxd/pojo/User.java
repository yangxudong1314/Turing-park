package com.yxd.pojo;

/**
 * @Title: User.java
 * @Package com.yxd.pojo
 * @Description: 用户表
 * @author 杨旭东
 * @date 2017年8月10日 下午5:29:01
 * @version V1.0
 */
public class User {
	private Integer id;
	private String username;
	private String password;
	private String emill;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmill() {
		return emill;
	}

	public void setEmill(String emill) {
		this.emill = emill;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", emill=" + emill + "]";
	}

}
