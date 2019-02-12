package Main;
import java.util.Date;
import java.util.Scanner;

import org.apache.jasper.tagplugins.jstl.core.Remove;

import com.programmer.gate.entities.*;

@SuppressWarnings("unused")
public class Gestion {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Etablissement e = new Etablissement();
		Classe c = new Classe("1b2");
		Classe c1 = new Classe("1b1");
		Classe c2 = new Classe("1b3");
		Classe c4 = new Classe("");
		Etudiants et = new Etudiants();
        et.setCode("12c");
		Etudiants ett = new Etudiants();
		Etudiants eet = new Etudiants();
		et.setCode("12b");
		e.ajou(c);
		e.ajou(c2);
		e.ajou(c1);
		e.ajout(et,"1b2");
		e.ajout(et, "1b1");
		e.ajout(et, "1b3");
		e.ajout(ett, "1b4");
		System.out.println("Bonjour! Veillez choisir une option:\n");
		System.out.println(" 1: Modifier un étudiant\n 2: Rechercher un étudiant\n 3: Créer une classe\n 4: Modifier une classe\n 5: Supprimer une classe\n 6: Ajout d''étudiant\n 7: Afficher les détails d'une classe\n  ");
		Scanner sc= new Scanner("System.in");
		int ch = sc.nextInt();
		switch(ch){
		case 1:{
		System.out.println("Veillez entrer le code de l''étudiant a modifier");
		String cod = sc.nextLine();
		eet=e.rechet(cod);
		if(eet instanceof Etudiants)
		System.out.println("1: Modif code\n 2: Modif nom\n 3: Modif prenom\n " );
		int choix = sc.nextInt();
		switch(choix){
		case 1: System.out.println("Entrer le nouveau code:\t");
		String cd= sc.nextLine();
		eet.setCode(cd);
		break;
		case 2: System.out.println("Entrer le nouveau nom;\t");
		String nm= sc.nextLine();
		eet.setNom(nm);
		break;
		case 3: System.out.println("Entrer le nouveau prenom:\t");
		String prem= sc.nextLine();
		eet.setPrenom(prem);
		break;
		}
		break;
		}
		case 2: System.out.println("Veillez saisir le code de l''étudiant a chercher:\n");
		String chh= sc.nextLine();
		eet=e.rechet(chh);
		if(eet instanceof Etudiants){
			System.out.println(eet.getId());
		    System.out.println("\n");
			System.out.println(eet.getNom());
			System.out.println("\n");
			System.out.println(eet.getPrenom());
			System.out.println("\n");
			System.out.println(eet.getDateNaissance());
			System.out.println("\n");		
			System.out.println(eet.getLieuNaissance());
		}
			else	
			System.out.println("Etudiant inexistant");
		break;
		case 3: System.out.println("Veillez saisir le nom de la classe:");
		String chhh= sc.nextLine();
		Classe c3= new Classe(chhh);
		e.ajou(c3);
		break;
		case 4: System.out.println("Veillez saisir le nom de la classe:");
		String chj= sc.nextLine();
		c4= e.rech(chj);
		if (c4 instanceof Classe)
		{System.out.println("Veillez saisir le nouveau nom de la classe");
		String n= sc.nextLine();
		c4.setNom(n);}
		else System.out.println("Classe inexistante");
		break;
		//case 5: System.out.println("Veillez saisir le nom de la classe a supprimé:");
		//String nomm= sc.nextLine();
		//c4= e.rech(nomm);
		//if (c4 instanceof Classe)
		//e.remove("c4");
			//else System.out.println("Classe inexistante");
		
	//	break;
		case 6: System.out.println("Veillez saisir le code de l''étudiant:");
		String x= sc.nextLine();
		eet=e.rechet(x);
		if(eet instanceof Etudiants){System.out.println("Etudiant existe déja");}
		else{
		System.out.println("Veillez saisir le nom de l''étudiant:");
		String y= sc.nextLine();
		System.out.println("Veillez saisir le prenom de l''étudiant:");
		String z= sc.nextLine();
		System.out.println("Veillez saisir la date de naissance de l''étudiant:");
		String t= sc.nextLine();
		System.out.println("Veillez saisir le lieu de naissance de l''étudiant:");
		String v= sc.nextLine();
		System.out.println("Veillez saisir le nom de la classe a lui affecté");
		String cls= sc.nextLine();
			Etudiants etu = new Etudiants(x,y,z,t,v);
			e.ajout(etu, cls);}
		break;
		case 7: System.out.println("Veillez donné le nom de la classe a afficher:");
		        String st= sc.nextLine();
		        c4= e.rech(st);
				if (c4 instanceof Classe){System.out.println(c4.getNom());}
				else System.out.println("Classe introuvable !");
				break;
		}
		
		
		
		
		
		

	}

}
