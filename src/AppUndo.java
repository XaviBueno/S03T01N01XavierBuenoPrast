import java.util.Scanner;

public class AppUndo {

	public static void main(String[] args) {
		String cmd;
		//Genera Instancia Única de la classe Undo
		
		Undo comandesEntrades =Undo.getUndo();
		
		int i=0;
		do {
		//Demana comanda	
			cmd=inputString(">:");
			switch(cmd) {
				case "history": //llista comandes
					comandesEntrades.imprimeixComandes();
					System.out.println("comandes esborrades");
					break;
				case "history -d": //Esborra comandes
					comandesEntrades.getComandes().clear();
					System.out.println("comandes esborrades");
					break;
				
					
				default:	//desa comanda
					comandesEntrades.afegirComanda(cmd);
					break;
				}
			
					
			
		}while(i==0); 

		
		
	};
	//Demana un string i mostra missatge
		static String inputString(String missatge) {
			Scanner input= new Scanner(System.in);
			System.out.print(missatge);
			return input.nextLine();
		}
}
