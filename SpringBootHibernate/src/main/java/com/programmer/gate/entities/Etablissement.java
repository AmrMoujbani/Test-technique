package com.programmer.gate.entities;

import java.util.Vector;

import javax.persistence.Entity;
@Entity
public class Etablissement {
	  private Vector<Classe> lc;

	    public Etablissement() {
	        this.lc = new Vector<Classe>();
	    }
	    
	    public void ajou (Classe c)
	    {
	    	lc.add(c);
	    }
	    public Classe rech(String no)
	    {
	        for(Classe i : lc) if(i.getNom().equals(no)) return i;
	        return null;
	    }
	    public void ajout (Etudiants e ,String no)
	    {
	        
	        for(Classe i :lc) 
	        if(i.getLe().contains(e)){System.out.println("Erreur !") ;return;}
	        Classe c=rech(no);
	        if(c instanceof Classe) 
	            c.ajout(e);
	            else System.out.println("Classe inexistante");
	            
	    }
	    public Etudiants rechet (String code)
		{
	    	for(Classe c: lc)
	    	for (Etudiants e: c.getLe())
	    		
	    	if( e.getCode().equals(code) )return e; System.out.println("Etudiant introuvable");
			return null;
			
		}
	   

}
