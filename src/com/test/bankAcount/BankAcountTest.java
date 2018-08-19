package com.test.bankAcount;

import static org.junit.Assert.*;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

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
import com.main.bankAcount.Transaction;

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
	public void transactionTest() throws NegativeAmountException {

		LocalDateTime date = LocalDateTime.now();
		BankAcount compteBancaire = new BankAcount("BIZLANE", "Lahcen", 123456789, 20000);
		Transaction transaction = new Transaction(EtatTransaction.RETRAIT, date, 222.545, 20000);

		compteBancaire.addTransactions(transaction);
		assertEquals(20000.0 - 222.545, transaction.getSolde(), 1e5);
		assertEquals(20000.0, transaction.getSolde(), 1e5);

	}

	@Test
	public void historiquetest() throws NegativeAmountException {
		LocalDateTime date = LocalDateTime.now();
		BankAcount compteBancaire = new BankAcount("BIZLANE", "Lahcen", 123456789, 20000);

		Transaction transaction = new Transaction(EtatTransaction.RETRAIT, date, 222.545, 20000);
		Transaction transaction0 = new Transaction(EtatTransaction.DEPOT, date, 222, 20000);
		Transaction transaction1 = new Transaction(EtatTransaction.RETRAIT, date, 333, 20000);
		Transaction transaction2 = new Transaction(EtatTransaction.DEPOT, date, 222.55, 20000);

		compteBancaire.addTransactions(transaction);
		compteBancaire.addTransactions(transaction0);
		compteBancaire.addTransactions(transaction1);
		compteBancaire.addTransactions(transaction2);

		String Historique = compteBancaire.toString();
		assertTrue(Historique.matches("Transaction [etatTransaction=RETRAIT, date=2018-08-19T16:35:13.071839800, montant=222.545, solde=19777.455]"));
	}

	@Test(expected = NegativeAmountException.class)
	public void shouldThrowExceptionWhenCalledWithNegatifAmount() throws NegativeAmountException {
		// BankAcount compteBancaire = new BankAcount("BIZLANE", "Lahcen", 123456789, 20000.00);
		LocalDateTime date = LocalDateTime.now();
		Transaction transaction = new Transaction(EtatTransaction.DEPOT, date, -222, 20000);
		transaction.transaction();

	}

}
