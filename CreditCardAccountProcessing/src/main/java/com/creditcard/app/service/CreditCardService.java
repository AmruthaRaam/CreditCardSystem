package com.creditcard.app.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class CreditCardService {
	public int calculateLuhnValue(String cardnumber) {
	 System.out.println("Service class  cardno. ::"+cardnumber +"length is" +cardnumber.length());
	 int length=cardnumber.length();
	 int sum=0;
	 boolean isSecondNum=false;
		 
	 for(int i=length-1;i>=0;i--)
	 {
		 int d= cardnumber.charAt(i)-'0';
		 System.out.println("value of d is ::" +d);
		 if(isSecondNum==true) {
			 d=d*2;
		 }
		 sum=sum+d/10;
		 sum=sum+d%10;
		 isSecondNum=!isSecondNum;
	 }
		return (sum%10);
	}

}
