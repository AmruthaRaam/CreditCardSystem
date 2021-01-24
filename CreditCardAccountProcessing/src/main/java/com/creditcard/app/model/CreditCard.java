package com.creditcard.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CreditCard {
	@Id
	private long cardNumber;
	private String name;
	private int cardLimit;
	private long balance=0;
	public CreditCard() {}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCardLimit() {
		return cardLimit;
	}
	public void setCardLimit(int cardLimit) {
		this.cardLimit = cardLimit;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", name=" + name + ", cardLimit=" + cardLimit + ", balance="
				+ balance + "]";
	}
	public CreditCard(long cardNumber, String name, int cardLimit, long balance) {
		super();
		this.cardNumber = cardNumber;
		this.name = name;
		this.cardLimit = cardLimit;
		this.balance = balance;
	}


}
