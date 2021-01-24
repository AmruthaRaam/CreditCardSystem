package com.creditcard.app.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.creditcard.app.CreditCardAccountProcessingApplication;
import com.creditcard.app.controller.CreditCardController;
import com.creditcard.app.dao.CreditCardRepo;
import com.creditcard.app.model.CreditCard;

@DataJpaTest
public class CreditCardControllerTest {
	  @Autowired
	    private CreditCardRepo repo;
	  @Test
	    public void testAddCreditCardInfo() {

	        CreditCard creditcard = new CreditCard(12345L, "admin", 12,0);
	        repo.save(creditcard);
	        CreditCard creditcard1 = repo.findByCardNumber(12345);
	        assertNotNull(creditcard);
	        assertEquals(creditcard1.getCardNumber(), creditcard.getCardNumber() );
	        assertEquals(creditcard1.getName(), creditcard.getName());
	    }
	 
	   @Test
	    public void testGetAllCreditCardInfo() {
		   CreditCard creditcard = new CreditCard(435667, "employee", 123,0);
	        repo.save(creditcard);
	        assertNotNull(repo.findAll());
	    }

}
