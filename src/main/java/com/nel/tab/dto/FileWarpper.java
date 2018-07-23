package com.nel.tab.dto;

import org.springframework.web.multipart.MultipartFile;

public class FileWarpper {

	
	private String title;
	
	private MultipartFile file;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public FileWarpper() {
		super();
	}

	public FileWarpper(String title, MultipartFile file) {
		super();
		this.title = title;
		this.file = file;
	}
	
	
}
