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
	
	//Redéfinition de la méthode toString:
	@Override
	public String toString() {
		return "NOM - "+nom+" Note - "+note ;
	}
	
	//Redefinition de ma méthode equals:
	@Override
	public boolean equals(Object obj) {
		if(! obj instanceof Etudiant.class) {
			
		}
	}
}
