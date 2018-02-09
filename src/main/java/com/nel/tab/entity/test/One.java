package com.nel.tab.entity.test;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class One {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    
	@NotNull(message = "名称不能为空")
	private String name;
	
	@OneToMany
	List<Many> manys;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Many> getManys() {
		return manys;
	}

	public void setManys(List<Many> manys) {
		this.manys = manys;
	}
	
	
}
