
import java.util.ArrayList;
import java.util.Iterator;

//Canvia la taula per una llista (List<Character>)
//Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONTANT’.
//Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’.


public class FaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Character> nom = new ArrayList<>();
    nom.add('S');
    nom.add('T');
    nom.add('E');
    nom.add('F');
    nom.add('A');
    nom.add('N');
    nom.add('O');
    nom.add('1');
    
	for (Character lletra : nom) {
//EsNumero(nom.get(lletra))==true No funciona
		
		if (EsNumero(lletra)==true) {
			System.out.println("Els noms de persones no contenen números!");
		}

		else {
//	EsVocal(nom.get(lletra))==true	No funciona	
			if (EsVocal(lletra)==true) {
				System.out.println("VOCAL");
			} else {
				System.out.println("CONSONANT");

			}
		}

	}
}
    
    
public static boolean EsNumero(Character c) {
	switch (c) {
	case '0':
	case '1':
	case '2':
	case '3':
	case '4':
	case '5':
	case '6':
	case '7':
	case '8':
	case '9':
		return true;
	default:
		return false;
	}

}
	
public static boolean EsVocal(Character c) {
	switch (c) {
	case 'a':
	case 'A':
	case 'e':
	case 'E':
	case 'i':
	case 'I':
	case 'o':
	case 'O':
	case 'u':
	case 'U':
		return true;
	default:
		return false;
	}

}
	
}
	
	
	
	
