package GestionEtudiant;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Etudiant e1=new Etudiant(1,"Hamid");
		Etudiant e2=new Etudiant(2,"Driss");
		Etudiant e3=new Etudiant(1,"Youssef");
		
		
		//Affichge du premier Etudiant ( ceci met en work la redefinition de toString)
		System.out.println(e1);
		
		//met en evidence la redefinition de la methode equals
		if(e1.equals(e3)) {
			System.out.println("Tey are the same student");
		}
		else {
			System.out.println("Tey aren't the same student");
		}
		
		//Modifier les notes des étudiants:
		e1.setNote(15);
		e2.setNote(12);
		e3.setNote(16);
		
		//Créer la liste des étudiants:
		List <Etudiant> mesEtudiants =new ListEtudiants();
		mesEtudiants.add(e1);
		mesEtudiants.add(e2);
		mesEtudiants.add(e3);
		
		System.out.println("Affichage"+mesEtudiants);
		
		
		
	}

}
