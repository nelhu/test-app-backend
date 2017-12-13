package com.nel.tab.basic.test_interface;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class) // ָ���������ṩ��
@SpringBootTest // �Զ������ò��Ի���
public class MainTest {
	
	@Autowired
	InterfaceImpl1 of;
	
	public static void ads(String[] args) {
		
//		of.say();
		
		
	}
	
	@Test
	public void testInterface() {
		System.out.println("syso");
		of.say();
	}

}
