package com.in.tel.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Customer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private HashMap<String,String> numberAndName;
	private HashMap<String,Character> numberAndStatus;
	
	public Customer(HashMap<String, String> numberAndName, HashMap<String, Character> numberAndStatus2 ) {
	    if ( numberAndName != null ) { this.numberAndName = numberAndName; }
	    if ( numberAndStatus2 != null ) { this.numberAndStatus = numberAndStatus2; }
	}

 
	public HashMap<String,Character> getNumberAndStatus() {
		return numberAndStatus;
	}
	public void setNumberAndStatus(HashMap<String,Character> numberAndStatus) {
		this.numberAndStatus = numberAndStatus;
	}
	private String name;
	
	/*public Customer(HashMap<String,String> numberAndName, HashMap<String,Character> numberAndStatus){
		this.numberAndName=numberAndName;
		this.numberAndStatus=numberAndStatus;
	}*/
	private List<String> num= new ArrayList<String>();
	//private String num;
	private char status='Y';
	
	public Customer(){
		super();
	}
	public Customer(String name, List<String> num, char status) {
		this.name = name;
		this.num = num;
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getNum() {
		return num;
	}
	public void setNum(List<String> num) {
		this.num = num;
	}
	
/*	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
*/
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public HashMap getNumberAndName() {
		return numberAndName;
	}
	public void setNumberAndName(HashMap numberAndName) {
		this.numberAndName = numberAndName;
	}


}
