package GestionEtudiant;

public class Etudiant implements Comparable<Etudiant> {
	private int id;
	private String nom;
	private double note;
	
	//Constructeur de la classe Etudiant:
	public Etudiant(int id,String nom) {
		this.id=id;
		this.nom=nom;
		this.note=10;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}


	public double getNote() {
		return note;
	}
	public void setNote(double note) {
		this.note = note;
	}

	//Red�finition de la m�thode toString:
	@Override
	public String toString() {
		return "NOM - "+nom+" - Note - "+note ;
	}
	
	//Redefinition de ma m�thode equals:
	@Override
	public boolean equals(Object obj) {
		// If the object is compared with itself then return true
		if(obj == this) {
			return true;
		}
		 /* Check if obj is an instance of Complex or not
        "null instanceof [type]" also returns false */
		if(!(obj instanceof Etudiant)) {
			return false;
		}
		Etudiant student = (Etudiant) obj;
		if(student.id==id) {
			return true;
		}
		else{
			return false;
		}
	}
	
	@Override
	public int compareTo(Etudiant e) {
		if(this.note>e.note) {
			return 1;
		}
		if(this.note==e.note) {
			return 0;
		}
		else
			return -1;
	}
	
}
