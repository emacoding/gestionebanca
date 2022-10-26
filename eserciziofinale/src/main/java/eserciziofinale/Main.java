package eserciziofinale;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 Azioni azioni = new Azioni();
		 ArrayList<ContoCorrente> contocorrente = new ArrayList<ContoCorrente>();
		 ArrayList<Correntista> correntisti = new ArrayList<Correntista>();
		
		int scelta = 9;
		while(scelta!=0)
		{
		
		
       

        try
        {
         
        	System.out.println("digita:");
    		System.out.println("1) per inserire un utente");
    		System.out.println("2) per modificare i dati degli utenti");
    		System.out.println("3) per ordinare i correntisti per cognome");
    		System.out.println("4) per prelevare tramite numero conto o codice fiscale");
    		System.out.println("5) per versare");
    		System.out.println("6) per inserire un conto");

    		System.out.println("0) per uscire dal programma");
        	
       	 scelta = in.nextInt(); 
        	
        
     
		switch(scelta) {
		
		case 1:
			azioni.inserimento(correntisti, contocorrente);
		    break;
		    
		  case 2:
			  azioni.ricerca(correntisti);
		    break;
		    
		  case 3:
			  azioni.ordinamento(correntisti);
		    break;
		    
		  case 4:
			  azioni.prelevare(correntisti, contocorrente);
		    break;
		    
		  case 5:
			  azioni.versare(correntisti, contocorrente);
			break;
		    
		  case 6:
			  azioni.conto(correntisti, contocorrente);
			    break;

			  
			}
        
}
        
        catch
        (Exception ex) {
         System.out.println("digita il tasto corretto!");
         in.nextLine();
         
       }
		
		
			
		}
	}
}

