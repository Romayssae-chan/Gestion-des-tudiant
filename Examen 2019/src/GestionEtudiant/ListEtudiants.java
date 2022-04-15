package GestionEtudiant;

import java.util.ArrayList;
import java.util.List;

public class ListEtudiants extends ArrayList<Etudiant> implements Condition {
	
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
	
	@Override
	public boolean estVrai(Etudiant e) {
		if(e.getNote()>13)
		{
			return true;
		}
		return false;
	}
	
	/*	Définir la fonction filtrer qui permet de retourner toutes les Etdudiants
	   qui satisfaits la condition c */
	public List<Etudiant> filtrer(Condition c){
		List <Etudiant> lista=new ListEtudiants();
		for (Etudiant e:this) {
			if(c.estVrai(e)==true) {
				lista.add(e);
			}
		}
		return lista;
	}
	
}
