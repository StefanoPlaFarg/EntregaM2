import java.util.ArrayList;

/*
 * 
 * 
 * FASE 4
Crea una altra llista amb el teu cognom on cada posici� correspongui a una lletra.

Fusiona les dues llistes en una sola. A m�s, afegeix una posici� amb un espai buit entre la primera i la segona. �s a dir, partim de la llista name i surname i al acabar l�execuci� nom�s tindrem una que es dir� fullName.

FullName: [�N�, �A�, �M�, �E�, � �, �S�, �U�, �R�, �N�, �A�, �M�, �E'}

 * 
 * 
 * 
 */
import java.util.ArrayList;

public class FaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Character> nom = new ArrayList<>();
	    nom.add('P');
	    nom.add('A');
	    nom.add('U');
	    	    
	    ArrayList<Character> cognom = new ArrayList<>();
	    cognom.add('V');
	    cognom.add('I');
	    cognom.add('L');
	    cognom.add('A');
	    
	    ArrayList<Character> nomComplet = new ArrayList<>();
	    
	    for (Character c:nom) {
	     nomComplet.add(c);
	    }
	    
	    nomComplet.add(' ');
	    	    
	    for (Character c:cognom) {
		     nomComplet.add(c);
		    }
	    
	    for (Character c:nomComplet){
	    	System.out.println(c);
	    }
		
		
	}

}
