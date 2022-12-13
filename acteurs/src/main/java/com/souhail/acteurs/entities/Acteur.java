package com.souhail.acteurs.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Acteur {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idActeur;
	private String nomActeur;
	private Double salaireActeur;
	private Date dateNaissance;
	@ManyToOne
	private Film film;

	public Acteur() {
		super();
	}

	public Acteur(String nomActeur, Double salaireActeur, Date dateNaissance) {
		super();
		this.nomActeur = nomActeur;
		this.salaireActeur = salaireActeur;
		this.dateNaissance = dateNaissance;
	}

	public Long getIdActeur() {
		return idActeur;
	}

	public void setIdActeur(Long idActeur) {
		this.idActeur = idActeur;
	}

	public String getNomActeur() {
		return nomActeur;
	}

	public void setNomActeur(String nomActeur) {
		this.nomActeur = nomActeur;
	}

	public Double getSalaireActeur() {
		return salaireActeur;
	}

	public void setSalaireActeur(Double salaireActeur) {
		this.salaireActeur = salaireActeur;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateCreation(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Override
	public String toString() {
		return "Acteur [idActeur=" + idActeur + ", nomActeur=" + nomActeur + ", salaireActeur=" + salaireActeur
				+ ", dateNaissance=" + dateNaissance + "]";
	}
}