package GestionEtudiant;

import java.util.ArrayList;
import java.util.List;

public class ListEtudiants extends ArrayList<Etudiant> {
	@Override
	public boolean add(Etudiant e) {
		if(this.contains(e))
			return false;
		else
			return super.add(e);
	}
	
	public List<Etudiant> filtrer(Condition c){
		
		return null;	
	}
}
