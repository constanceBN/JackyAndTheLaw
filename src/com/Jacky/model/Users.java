package com.Jacky.model;

public class Users {

	private int idUser;
	private String nomUser;
	private String prenomUser;
	private String mail;
	private String motDePasse;
	private String entreprise;
	private String domaineProfessionel;
	private boolean isAdministrateur;

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNomUser() {
		return nomUser;
	}

	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}

	public String getPrenomUser() {
		return prenomUser;
	}

	public void setPrenomUser(String prenomUser) {
		this.prenomUser = prenomUser;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}

	public String getDomaineProfessionel() {
		return domaineProfessionel;
	}

	public void setDomaineProfessionel(String domaineProfessionel) {
		this.domaineProfessionel = domaineProfessionel;
	}

	public boolean isAdministrateur() {
		return isAdministrateur;
	}

	public void setAdministrateur(boolean isAdministrateur) {
		this.isAdministrateur = isAdministrateur;
	}

	@Override 

	public String toString() {
		return "L'user :  numéro : " + idUser + ", nom =" + nomUser + ", prenom : " + prenomUser + ", mail :" + mail
				+ ", mot de passe :" + motDePasse + ", entreprise : " + entreprise + ", domaine professionnel : "
				+ domaineProfessionel;
	}

}
