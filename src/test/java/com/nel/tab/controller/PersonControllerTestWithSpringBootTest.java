package com.nel.tab.controller;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.nel.tab.entity.Person;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc // 启用@MockMvc： 不需要启动http服务器就可以提供对springMVC控制器自动化测试的强大支持
@SpringBootTest // 自动启动模拟的web环境,实现controller, service, jpa层的测试 
public class PersonControllerTestWithSpringBootTest {

	@Autowired
	private MockMvc mvc;
	
	@Test
	public void testSrpingBootIntergratedTestWithMvc() throws Exception {
		
		mvc.perform(get("/login").contentType(MediaType.TEXT_PLAIN)).
		andDo(print()).andExpect(status().isOk());
		
	}
	
	@Test
	public void testNewJpa() throws Exception {
		
		mvc.perform(get("/newJpa").param("name", "mmm").contentType(MediaType.TEXT_PLAIN)).
		andDo(print()).andExpect(status().isOk());
		
	}
	
	@Test
	public void testMsgJpa() throws Exception {
		Person p = new Person("asd", "asd", 100);
//		JSON
		mvc.perform(post("/msgJpa").content("{name: 'adsd', age: 'asd', money: ''}").contentType(MediaType.APPLICATION_JSON)).
		andDo(print()).andExpect(status().isOk());
		
	}
}
