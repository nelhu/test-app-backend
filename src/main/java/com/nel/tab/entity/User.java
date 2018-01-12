package com.nel.tab.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.nel.tab.entity.converter.BooleanIntegerConverter;

@Entity
@Table(name = "users")
@Where(clause="deleted=0")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler", "fieldHandler", "password" })
public class User extends BaseEntityObject{

	@Column(length = 4, nullable = false)
	private String name;
	
	@Column(length = 15, nullable = false)
	private String password;
	
	@Convert(converter = BooleanIntegerConverter.class)
	@Column(nullable = false, columnDefinition = "integer default 1") // 0: 系统用户  1： 业务用户
	private Boolean isSysUser;
	
	@ManyToMany(mappedBy = "users")
	private List<Role> roles;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsSysUser() {
		return isSysUser;
	}

	public void setIsSysUser(Boolean isSysUser) {
		this.isSysUser = isSysUser;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public User() {}
	
}
