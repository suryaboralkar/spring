package com.xworkz.xworkzapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.xworkzapp.dao.PizzaDAO;
import com.xworkz.xworkzapp.dto.PizzaDTO;
@Component
public class PizzaServiceImpli implements PizzaService{
	@Autowired
    private PizzaDAO dao;
	
	


	@Override
	public void validatePizzaData(PizzaDTO dto) {
		System.out.println("data added sucessfull");
		boolean res = true;
		if (dto.getName() == null) {
			System.out.println("please select the pizza name");
			res = false;
		}
		if (dto.getLocation() == null || dto.getLocation().length() < 5) {
			System.out.println("please check with your entered location");
			res = false;
		}
		if (dto.getPrice() == 0 || dto.getPrice() < 55) {
			System.out.println("please enter valid price");
			res=false;
		}
		if (dto.getSize() == null) {
			System.out.println("please select the size");
			res = false;
		}
		if (dto.getType() == null) {
			System.out.println("please select the type");
			res=false;
		}
		if(res) {
		dao.savePizzaData(dto);
			
		}
		
	}

}
