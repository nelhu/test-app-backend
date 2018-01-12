package com.nel.tab.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "authorities")
@Where(clause="deleted=0")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler", "fieldHandler"})
public class Authority extends BaseEntityObject{

	@Column(length = 15, unique = true, nullable = false)
	private String authority;
	
	@Column(length = 20, unique = true, nullable = false)
	private String name;
	
	@Column(length = 100, nullable = true)
	private String description;
	
	@ManyToMany(mappedBy = "authorities")
	private List<Role> roles;

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}


	
	
}
