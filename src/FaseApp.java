
//FASE
//Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen. 

import java.util.ArrayList;
import java.util.HashMap;

public class FaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> contenidor = new HashMap<Character, Integer>();
		ArrayList<Character> nom = new ArrayList<>();
	    nom.add('S');
	    nom.add('T');
	    nom.add('E');
	    nom.add('F');
	    nom.add('A');
	    nom.add('N');
	    nom.add('N');
		
	    
	    for (Character lletra:nom) {
	       	if (contenidor.containsKey(lletra)==false ||contenidor.isEmpty() ) {	    		
	    		contenidor.put(lletra, 1);
	    			    			    		
	    	}
	    	
	    	else {
	    		contenidor.put(lletra, contenidor.get(lletra)+1);
	    	}	    		    	
	    	
	    }
	    
	    for (Character c: contenidor.keySet()) {	    	
	    	System.out.println("key: " + c + " value: " + contenidor.get(c));
	    }
		
		

	}

}
