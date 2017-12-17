package com.nel.tab.controller;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(value = RootController.class) 
// WebMvcTest自动化配置springMVC的web基础环境， 包括自动扫描@controller, @ControllerAdvice, @JsonComponent, Filter, WebMvcConfigurer and HandlerMethodArgumentResolver等注解, 不扫描serivice, repository等其他component 
// 并且自动配置@MockMvc, @MockMvc： 不需要启动http服务器就可以提供对springMVC控制器自动化测试的强大支持
public class PersonControllerTestWithWebMvcTest {

	@Autowired
	private MockMvc mvc;
	
	@Test
	public void testSImpleMapping() throws Exception {
		
		mvc.perform(get("/login").contentType(MediaType.TEXT_PLAIN)).
		andDo(print()).andExpect(status().isOk());
		
	}
}
