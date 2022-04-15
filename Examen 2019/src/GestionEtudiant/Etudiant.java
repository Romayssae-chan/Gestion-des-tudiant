package GestionEtudiant;

public class Etudiant {
	private int id;
	private String nom;
	private double note;
	
	//Constructeur de la classe Etudiant:
	public Etudiant(int id,String nom) {
		this.id=id;
		this.nom=nom;
		this.note=10;
	}
	
	//Red�finition de la m�thode toString:
	@Override
	public String toString() {
		return "NOM - "+nom+" Note - "+note ;
	}
	
	//Redefinition de ma m�thode equals:
	@Override
	public boolean equals(Object obj) {
		if(! obj instanceof Etudiant.class) {
			
		}
	}
}
