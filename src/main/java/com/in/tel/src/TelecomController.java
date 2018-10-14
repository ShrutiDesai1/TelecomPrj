
package com.in.tel.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in.tel.bean.Customer;
import com.in.tel.builder.TelephoneBuilder;
import com.in.tel.service.TelecomService;

@RestController
@RequestMapping(value="/telephone")
public class TelecomController {

	List<Customer> custs=new ArrayList<Customer>();

	@Autowired 
	TelecomService telecomService;

	@Autowired 
	TelephoneBuilder telephoneBuilder;

	@Autowired
	@Qualifier(value = "customer")
	Customer customer;

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	//This method will get all the phone numbers
	@GetMapping
	public List<String> getNumbers(){
		List<Customer> custs=new ArrayList<Customer>();
		List<String> nums=new ArrayList<String>();
		custs=telecomService.builder();
		nums=telecomService.getAllNumbers(custs);
		return nums;	
	}

	//This method will give all the phone numbers of the particular customer
	@GetMapping("/{name}")
	public List<String> getNumberEmp(@PathVariable String name){
		List<String> numbers=new ArrayList<String>();
		custs=telecomService.builder();
		numbers=telecomService.getNumbersOfCustomer(custs,name);
		return numbers;	
	}

	//This method will activate the number by changing the status 'N' to 'Y'
	@PutMapping(value="/update/{number}")
	public String updateStatus(@PathVariable String number){
		String result;
		custs=telecomService.builder();
		result=telecomService.updateStatus(custs,number);
		return result;
	}

	
	// This method will show the updated status after update method
	@GetMapping(value="/getStatus/")
	public HashMap<String,Character> getStatusDetailsCust(){
		return telecomService.getStatusDetailsCust();
	}
	 
}
