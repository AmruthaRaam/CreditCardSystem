package com.creditcard.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.creditcard.app.model.CreditCard;

@Repository
public interface CreditCardRepo extends JpaRepository<CreditCard,Integer> {
	CreditCard findByCardNumber(long cardNumber);

}
