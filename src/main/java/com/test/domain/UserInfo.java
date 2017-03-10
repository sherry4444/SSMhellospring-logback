package com.test.domain;

import java.io.Serializable;

/*
userId	int
userName	varchar
Password	varchar
salt	varchar
mobilePhone	varchar
userEmail	varchar
createTime	timestamp
modifyTime	timestamp
state	bit
role	int
*/

public class UserInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer userId;
	private String userName;
	private String Password;


	public UserInfo() {
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public UserInfo(Integer userId, String userName, String password) {
		this.userId = userId;
		this.userName = userName;
		Password = password;
	}

	@Override
	public String toString() {
		return "UserInfo{" +
				"userId=" + userId +
				", userName='" + userName + '\'' +
				", Password='" + Password + '\'' +
				'}';
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
}
