package com.main.bankAcount;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.Exception.bankAcount.NegativeAmountException;

/**
 * @author Lahcen
 *
 */
public class BankAcount {

	private String nomTitulaireCompte;
	private String prenomTitulaireCompte;
	private int numeroCompte;
	private double solde;
	List<Transaction> ListeTransactions = new ArrayList<Transaction>();
	
	/* Constructeur */
	public BankAcount(String nomTitulaireCompte, String prenomTitulaireCompte, int numeroCompte, double solde) {
		super();
		this.nomTitulaireCompte = nomTitulaireCompte;
		this.prenomTitulaireCompte = prenomTitulaireCompte;
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}
	
	/* Getters & Setters */
	public String getNomTitulaireCompte() {
		return nomTitulaireCompte;
	}
	public void setNomTitulaireCompte(String nomTitulaireCompte) {
		this.nomTitulaireCompte = nomTitulaireCompte;
	}
	public String getPrenomTitulaireCompte() {
		return prenomTitulaireCompte;
	}
	public void setPrenomTitulaireCompte(String prenomTitulaireCompte) {
		this.prenomTitulaireCompte = prenomTitulaireCompte;
	}
	public int getNumeroCompte() {
		return numeroCompte;
	}
	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/**
	 * @return the listeTransactions
	 */
	public List<Transaction> getListeTransactions() {
		return ListeTransactions;
	}

	/**
	 * @param listeTransactions the listeTransactions to set
	 */
	public void setListeTransactions(List<Transaction> listeTransactions) {
		ListeTransactions = listeTransactions;
	}
	
	public void addTransactions(Transaction transaction) throws NegativeAmountException {
		transaction.transaction();
		this.ListeTransactions.add(transaction);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BankAcount [nomTitulaireCompte=" + nomTitulaireCompte + ", prenomTitulaireCompte=" + prenomTitulaireCompte + ", numeroCompte=" + numeroCompte + ", ListeTransactions=" + ListeTransactions + "]";
	}

}
