package com.nel.tab.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "roles")
@Where(clause = "deleted = 0")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler", "fieldHandler" })
public class Role extends BaseEntityObject{

	@Column(length = 15, nullable = false, unique = true)
	private String name;

	@Column(length = 100, nullable = true)
	private String description;
	
	@ManyToMany
	@JoinTable(
			joinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")},
			inverseJoinColumns = {@JoinColumn(name = "authority_id", referencedColumnName = "id")})
	private List<Authority> authorities;
	
	@ManyToMany
	@JoinTable(
			joinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")},
			inverseJoinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")})
	private List<User> users;

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

	public List<Authority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<Authority> authorities) {
		this.authorities = authorities;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Role() {}

}
