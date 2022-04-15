package GestionEtudiant;

import java.util.ArrayList;
import java.util.List;

public class ListEtudiants extends ArrayList<Etudiant> {
	
	@Override
	public boolean add(Etudiant e) {
		if(this.contains(e)) {
			int indice=0;
			for(Etudiant l: this)
			{
				if(l.getId()==e.getId())
				{
					set(indice, e);
				}
				indice++;
			}
			return false;
		}
		else
			return super.add(e);
	}
	
	public List<Etudiant> filtrer(Condition c){
		
		return null;	
	}
}
