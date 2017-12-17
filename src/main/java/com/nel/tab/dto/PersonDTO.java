package com.nel.tab.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonDTO {
	
	private Long id;

	@NotNull(message = "name不能为空！")
	private String name;
	
	@NotNull(message = "故障级别不能为空！")
	private String age;
	
	// 故障描述
	@NotNull(message = "money")
	private String mon;

}
