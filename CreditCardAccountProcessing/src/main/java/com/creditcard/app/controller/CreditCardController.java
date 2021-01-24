package com.creditcard.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.creditcard.app.dao.CreditCardRepo;
import com.creditcard.app.model.CreditCard;
import com.creditcard.app.service.CreditCardService;

@RestController
public class CreditCardController {
	@Autowired
	CreditCardRepo repo;
	@Autowired
	CreditCardService service;

@PostMapping("/addCreditCardInfo")
public String addCreditInfo(@RequestBody CreditCard info) {
	System.out.println("num is "+info.getCardNumber());
	int luhnVal=service.calculateLuhnValue(String.valueOf(info.getCardNumber()));
	String message="";
	if(luhnVal==0) {
		repo.save(info);
		message="Credit Card Information Added SuccessFully!!";
	}
	else {
		message="Please enter a valid Credit Card Number";		
	}
	return message;
}
@GetMapping("/getCreditCardInfo")
public List<CreditCard> getCreditInfo(){
return repo.findAll();

}
}
