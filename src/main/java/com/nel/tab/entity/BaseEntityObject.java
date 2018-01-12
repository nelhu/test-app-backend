package com.nel.tab.entity;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.ColumnDefault;

import com.nel.tab.entity.converter.BooleanIntegerConverter;

@MappedSuperclass
public class BaseEntityObject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Convert(converter = BooleanIntegerConverter.class)
	@Column(nullable = false)
	@ColumnDefault("0") // 0: 未删除  1： 已删除
	private Boolean deleted;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public BaseEntityObject() {}
	
}
