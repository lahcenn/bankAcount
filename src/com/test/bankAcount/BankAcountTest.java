package com.test.bankAcount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import com.Exception.bankAcount.NegativeAmountException;
import com.main.bankAcount.BankAcount;
import com.main.bankAcount.EtatTransaction;

public class BankAcountTest {


	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void transactionTest() {

		BankAcount compteBancaire = new BankAcount("BIZLANE", "Lahcen", 123456789, 20000);

		compteBancaire.transaction(222.545, EtatTransaction.RETRAIT);
		assertEquals(20000.0 - 222.545, compteBancaire.getSolde(),1e5);

		compteBancaire.transaction(222.545, EtatTransaction.DEPOT);
		assertEquals(20000.0, compteBancaire.getSolde(),1e5);
	}

	@Test(expected = NegativeAmountException.class )
	public void shouldThrowExceptionWhenCalledWithNegatifAmount(){
		BankAcount compteBancaire = new BankAcount("BIZLANE", "Lahcen", 123456789, 20000);
		compteBancaire.transaction(-245.23,EtatTransaction.DEPOT);
		
		
	}

}
