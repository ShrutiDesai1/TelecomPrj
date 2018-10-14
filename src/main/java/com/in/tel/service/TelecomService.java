package com.in.tel.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in.tel.bean.Customer;
import com.in.tel.builder.TelephoneBuilder;

@Component
public class TelecomService {

	@Autowired 
	TelephoneBuilder telephoneBuilder;
	
	
	public List<String> getNumbersOfCustomer(List<Customer> custs,String name){
		return telephoneBuilder.getNumbersOfCustomer(custs,name);
	}
	
	public List<String> getAllNumbers(List<Customer> custs){
		return telephoneBuilder.getAllNumbers(custs);
	}
	
	public String updateStatus(List<Customer> custs,String number){
		return telephoneBuilder.updateStatus(custs,number);
	}
	
	public HashMap<String,Character> getStatusDetailsCust(){
		return telephoneBuilder.getStatusDetailsCust();
	}
	
	public List<Customer> builder(){
		return telephoneBuilder.builder();
	}
	
}
