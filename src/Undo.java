import java.util.ArrayList;
import java.util.Iterator;

public class Undo {
	//Atributs
	private static ArrayList<String> comandes;
	
	//Declaració
	private static Undo undo;
	
	
	//Constructor, private no es podrà fer més d'una instància de la classe
	
	private Undo() {
		comandes= new ArrayList<>();
	};
	
	public  void afegirComanda(String comanda){
		comandes.add(comanda);
		
	}
	
	public ArrayList<String> getComandes() {
		return comandes;
	}
		
	public void esborraComandes() {
		comandes.clear();
	}
	
	
	//Amb aquest mètode s'obtindrà la instància
	public static Undo getUndo() {
		if (undo==null) {
			undo= new Undo();
		}
		return undo;
		
	}
  
	//Imprimeix comandes
	
	public void imprimeixComandes() {
		int i=1;
		Iterator<String> comanda = comandes.iterator();
		while(comanda.hasNext()) {
			System.out.println(i+":"+comanda.next());
			++i;
		}
		
	}

	
 
 
}
