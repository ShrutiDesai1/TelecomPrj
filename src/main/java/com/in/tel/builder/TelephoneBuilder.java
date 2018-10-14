package com.in.tel.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.in.tel.bean.Customer;

@Repository
public class TelephoneBuilder {

	@Autowired
	Customer customer;	
	//Creating an instance variable custs
	List<Customer> custs=new ArrayList<Customer>();	
	//Taking Number as Key so that Number will be unique and value as a Name
	HashMap<String,String> numberAndName=new HashMap<String,String>();	
	//HashMap<String,Character> numberAndStatus=new HashMap<String,Character>();

	HashMap<String,Character> numberAndStatus=new HashMap<String,Character>();


	public List<Customer> builder(){
		this.numberAndName=new HashMap<String,String>();
		numberAndName.put("8884821441", "Ross Geller");
		numberAndName.put("8454822440", "John Carter");
		numberAndName.put("8834824123", "Michael Shimmer");
		numberAndName.put("8804824453", "Tom Claney");
		numberAndName.put("7804574450", "Tom Claney");
		numberAndName.put("7444574123", "Tom Claney");
		numberAndName.put("8445622410", "Monica Daniel");

		this.numberAndStatus=new HashMap<String,Character>();
		numberAndStatus.put("8884821441",'N');
		numberAndStatus.put("8454822440",'N');
		numberAndStatus.put("8834824123",'N');
		numberAndStatus.put("8804824453",'N');
		numberAndStatus.put("7804574450",'N');
		numberAndStatus.put("7444574123",'N');
		numberAndStatus.put("8445622410",'N');

		custs.add(new Customer(numberAndName,numberAndStatus));
		return custs;
	}
	
	public List<String> getCustomerPh(List<Customer> custs,String name){
		List<String> nums=new ArrayList<String>();
		for(int i=0;i<custs.size();i++){
			if(custs.get(i).getName().equals(name)){
				nums=custs.get(i).getNum();
			}
		}
		return nums;
	}
	public String updateStatus(List<Customer> custs,String number){
		String status=null;
		HashMap<String,Character> map=new HashMap<String,Character>();
		if(numberAndStatus.containsKey(number))
		{
			for(Map.Entry<String, Character> entry:numberAndStatus.entrySet())
			{
				if(entry.getKey().equals(number))
				{
					numberAndStatus.put(number, 'Y');
					status="The number "+number+" is now activated";
				}
			}
		}
		return status;
	}

	public List<String> getAllNumbers(List<Customer> custlist){
		List<String> num=new ArrayList<String>();
		//Collect all keys as keys are all the phone numbers in our map
		num.addAll(numberAndName.keySet());
		return num;
	}
	
	public HashMap<String,Character> getStatusDetailsCust(){
		return this.numberAndStatus;
	}
		
	public List<String> getNumbersOfCustomer(List<Customer> custs,String name){
		List<String> nums=new ArrayList<String>();
			if(numberAndName.containsValue(name))
			{						
				for (Map.Entry<String,String> entry : numberAndName.entrySet()) 
				{
					if (entry.getValue().equals(name))
					{
						nums.add(entry.getKey());
					}
				}
			}
		
		return nums;
	}
	
//	public HashMap<String,Character> getU

}
