package com.nel.tab.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    
	@NotNull(message = "name不能为空！")
	private String name;
	
	@NotNull(message = "age不能为空！")
	private String age;
	
	@NotNull(message = "money不能为空！")
	private Integer money;
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

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

	public Person(String name, String age, Integer money) {
		super();
		this.name = name;
		this.age = age;
		this.money = money;
	}

	public Person(Long id, String name, String age, Integer money) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.money = money;
	}
	
}
