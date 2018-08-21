package com.main.bankAcount;

import java.sql.Date;
import java.time.LocalDateTime;

import com.Exception.bankAcount.NegativeAmountException;

public class Transaction {

	
	EtatTransaction etatTransaction;
	LocalDateTime date;
	double montant;
	double solde;
	
	/**
	 * @param etatTransaction
	 * @param date
	 * @param montant
	 * @param solde
	 */
	public Transaction(EtatTransaction etatTransaction, LocalDateTime date, double montant, double solde) {
		super();
		this.etatTransaction = etatTransaction;
		this.date = date;
		this.montant = montant;
		this.solde = solde;
	}
	/* Getters & Setters */
	
	public EtatTransaction getEtatTransaction() {
		return etatTransaction;
	}
	public void setEtatTransaction(EtatTransaction etatTransaction) {
		this.etatTransaction = etatTransaction;
	}
	
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		montant = montant;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		solde = solde;
	}
	
	/* Transaction */
	public void transaction() throws NegativeAmountException {
			
			if(montant <0) {
				throw new NegativeAmountException("Montant négtif");
			}
			
			if(etatTransaction.equals(EtatTransaction.RETRAIT)) {
				solde -= montant;	
			}else{
				solde += montant;
			}
		}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Transaction [etatTransaction=" + etatTransaction + ", date=" + date + ", montant=" + montant + ", solde=" + solde + "]";
	}
	
}
