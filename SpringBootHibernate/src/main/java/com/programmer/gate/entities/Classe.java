package com.programmer.gate.entities;
import java.util.Vector;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Classe {
	
@Id
@GeneratedValue
	 private String id;
	 private String nom;
	    private Vector<Etudiants> le;

	    public Classe(String nom) {
	        this.nom = nom;
	        this.le = new Vector<Etudiants>();
	    }
	    
	    
	    
	    public void ajout(Etudiants e)
	    {
	        le.add(e);
	    }

	    public String getNom() {
	        return nom;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	    }

	    public Vector<Etudiants> getLe() {
	        return le;
	    }

	    public void setLe(Vector<Etudiants> le) {
	        this.le = le;
	    }
	   
	    
	}