package com.deepread.forhead.entity;

import com.deepread.forhead.enums.*;

import javax.persistence.*;
import java.util.*;

@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	@Column(length = 50,nullable = false,unique = true)
    private String nickName;
	@Column(length = 50,nullable = false,unique = true)
	private String email;
	@Column(length = 20)
	private String mobile;
	@Column(length = 3,nullable = false)
	private UserStatusEnum status;
	@Column(nullable = false)
	private Date createTime;
	@Column(nullable = false)
	private Date updateTime;

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public UserStatusEnum getStatus() {
		return status;
	}

	public void setStatus(UserStatusEnum status) {
		this.status = status;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}