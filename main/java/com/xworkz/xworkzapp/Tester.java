package com.xworkz.xworkzapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.xworkzapp.dao.PizzaDAO;
import com.xworkz.xworkzapp.dao.PizzaDAOImpli;
import com.xworkz.xworkzapp.dto.PizzaDTO;
import com.xworkz.xworkzapp.service.PizzaServiceImpli;

public class Tester {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	
	
	      PizzaServiceImpli bean = context.getBean(PizzaServiceImpli.class);
	     PizzaDTO dto = new PizzaDTO("pizza", "khgftion", 244, true, "size", "type");
	   bean.validatePizzaData(dto);
}
}
