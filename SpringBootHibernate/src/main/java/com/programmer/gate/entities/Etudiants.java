package com.programmer.gate.entities;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
@SuppressWarnings({ "serial", "unused" })
@Entity
public class Etudiants implements Serializable{
	@Id
	@GeneratedValue
	private Long id;
	 @Column(name = "code")
	private String code;
	 @Column(name = "nom")
	private String nom;
	 @Column(name = "prenom")
	private String prenom;
	 @Column(name = "dateNaissance")
	private String dateNaissance;
	 @Column(name = "lieuNaissance")
	private String lieuNaissance;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getLieuNaissance() {
		return lieuNaissance;
	}
	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}
	public Etudiants(String code, String nom, String prenom, String dateNaissance, String lieuNaissance) {
		super();
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.lieuNaissance = lieuNaissance;
	}
	public Etudiants() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
