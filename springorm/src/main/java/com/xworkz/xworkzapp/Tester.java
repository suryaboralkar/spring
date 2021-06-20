package com.xworkz.xworkzapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.xworkzapp.dao.PizzaDAO;
import com.xworkz.xworkzapp.dao.PizzaDAOImpli;
import com.xworkz.xworkzapp.dto.PizzaDTO;

public class Tester {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	
	
	PizzaDAO dao = context.getBean(PizzaDAOImpli.class);
	     PizzaDTO dto = new PizzaDTO("pizza", "tion", 244, true, "size", "type");
	     dao.savePizzaData(dto);
}
}
