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

import com.google.gson.Gson;
import com.nel.tab.entity.Person;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc // 鍚敤@MockMvc锛� 涓嶉渶瑕佸惎鍔╤ttp鏈嶅姟鍣ㄥ氨鍙互鎻愪緵瀵箂pringMVC鎺у埗鍣ㄨ嚜鍔ㄥ寲娴嬭瘯鐨勫己澶ф敮鎸�
@SpringBootTest // 鑷姩鍚姩妯℃嫙鐨剋eb鐜,瀹炵幇controller, service, jpa灞傜殑娴嬭瘯 
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
		Person p = new Person("", "asd", 100);
		Gson gs = new Gson();
		String json = gs.toJson(p);
		mvc.perform(post("/msgJpa").content(json).contentType(MediaType.APPLICATION_JSON)).
		andDo(print()).andExpect(status().isOk());
		
	}
}
