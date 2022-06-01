package com.heroku.app.dto;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "USER_INFO", schema = "BUSS")
//@SequenceGenerator(name = "userInfoSeq", sequenceName = "BUSS.USER_INFO", allocationSize = 1)
public class UserInfoDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4818357678527912902L;

	private long userId;
	
	private String userName;
	
	private String password;
	
	private String email;
	
	private String userType;
	
	private Timestamp createDt;
	
	private Timestamp updateDt;

	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userInfoSeq")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID", nullable = false)
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Column(name = "USER_NAME", nullable = false)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "PASSWORD", nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "EMAIL")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "USER_TYPE", length = 1)
	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Column(name = "CREATE_DT")
	public Timestamp getCreateDt() {
		return createDt;
	}

	public void setCreateDt(Timestamp createDt) {
		this.createDt = createDt;
	}

	@Column(name = "UPDATE_DT")
	public Timestamp getUpdateDt() {
		return updateDt;
	}

	public void setUpdateDt(Timestamp updateDt) {
		this.updateDt = updateDt;
	}

}
