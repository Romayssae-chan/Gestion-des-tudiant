package GestionEtudiant;

public class Main {

	public static void main(String[] args) {
		Etudiant student1=new Etudiant(4585,"Romayssae");
		Etudiant student2=new Etudiant(4321,"Aicha");
		Etudiant student3=new Etudiant(4589,"Kaoutar");
		Etudiant student4=new Etudiant(4584,"Najat");
		Etudiant student5=new Etudiant(5742,"Farah");
		
		//Affichge du premier Etudiant ( ceci met en work la redefinition de toString)
		System.out.println(student1);
		
		//met en evidence la redefinition de la methode equals
		if(student1.equals(student4)) {
			System.out.println("Tey are the same student");
		}
		else {
			System.out.println("Tey aren't the same student");
		}
		
		
	}

}
