package com.main.bankAcount;

/**
 * @author Lahcen
 *
 */
public class BankAcount {

	private String nomTitulaireCompte;
	private String prenomTitulaireCompte;
	private int numeroCompte;
	private double solde;
	
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
	
	/* retour des propriétés :
	 *  nomTitulaireCompte
	 *  prenomTitulaireCompte
	 *  numeroCompte
	 *  solde
	 *  */
	@Override
	public String toString() {
		return "BankAcount [nomTitulaireCompte=" + nomTitulaireCompte + ", prenomTitulaireCompte="
				+ prenomTitulaireCompte + ", numeroCompte=" + numeroCompte + ", solde=" + solde + "]";
	}	
}
