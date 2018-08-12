package com.test.bankAcount;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.main.bankAcount.BankAcount;
import com.main.bankAcount.EtatTransaction;

class bankAcountTest {

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
	void retraitTest() {
		
		BankAcount compteBancaire = new BankAcount("BIZLANE", "Lahcen", 123456789, 20000);
		
		compteBancaire.transaction(222.545,EtatTransaction.RETRAIT);
		assertEquals(20000-222.545, compteBancaire.getSolde());
		
		compteBancaire.transaction(222.545, EtatTransaction.DEPOT);
		assertEquals(20000+222.545, compteBancaire.getSolde());
	}

}
