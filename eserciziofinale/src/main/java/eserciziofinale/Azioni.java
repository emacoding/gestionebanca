package eserciziofinale;

import java.util.ArrayList;
import java.util.Scanner;



public class Azioni {

	 Scanner in = new Scanner(System.in); 


     Correntista correntista = new Correntista();
ContoCorrente conto = new ContoCorrente();
	
	
	public void inserimento(ArrayList<Correntista> correntisti, ArrayList<ContoCorrente> contocorrente){
		



		  System.out.print("inserisci cognome correntista: ");
	       String cognomeinserito = in.nextLine(); 
	       

			  System.out.print("inserisci nome correntista: ");
			  
		       String nomeinserito = in.nextLine(); 
		  System.out.print("inserisci codicefiscale correntista: ");
	       String codicefiscaleinserito = in.nextLine();
	       
			  System.out.print("inserisci username: ");
		       String usernameinserito = in.nextLine();

			  System.out.print("inserisci password: ");
		       String passwordinserita = in.nextLine();

		      
	       
	       
	       
	       
	       int doppio=0;
	       for(Correntista i : correntisti)
	       {
  	

	       if(codicefiscaleinserito.equals(i.getCodicefiscale())   )
			{
	    	   
	    	   				
				 doppio = 1;
				
			}
	       
	       
	       }
	   
	       if(doppio ==0)
	       {
	    	   
     Correntista correntista = new Correntista();
     correntista.setNome(nomeinserito);
     correntista.setCognome(cognomeinserito);
     correntista.setCodicefiscale(codicefiscaleinserito);
     correntista.setPassword(passwordinserita);
     correntista.setUsername(usernameinserito);


	    correntisti.add(correntista);
 	   System.out.println("inserimento effettuato");

	    
	       }
	       else
	       {
	    	   
	    	   
	    	   System.out.println("codice fiscale gia' inserito");
	       }
	       
	       
	
}
	
	
	
	

	public void ricerca(ArrayList<Correntista> correntisti){
		



			  System.out.print("inserisci il nome da ricercare: ");
		       String nomericerca = in.nextLine(); 
		       

				  System.out.print("inserisci cognome da ricercare: ");
				  
			       String cognomericerca = in.nextLine(); 
			  System.out.print("inserisci codicefiscale da ricercare: ");
		       String codicefiscalericerca = in.nextLine(); 
		       
		
		       int posizione = 0;
	       int trovato=0;
	
			for (int i = 0; i < correntisti.size(); i++) {
				
				
			    
	      if(nomericerca.equals(correntisti.get(i).getNome()) && cognomericerca.equals(correntisti.get(i).getCognome())  && codicefiscalericerca.equals(correntisti.get(i).getCodicefiscale()))
			{
				
				trovato=trovato+1;
				 posizione = i;
				
			}
	       
			}
	      
	       
	       
	       if(trovato == 1)
	       {
	    	   
				System.out.println("utente trovato");
				
				System.out.print("digita nuovo nome: ");
			       String nomemodifica = in.nextLine(); 


				System.out.print("digita nuovo cognome: ");
			       String cognomemodifica = in.nextLine(); 

			       Correntista correntistamodifica = correntisti.get(posizione); 

			       correntistamodifica.setNome(nomemodifica);
			       correntistamodifica.setCognome(cognomemodifica);
			       
			       
			       
			       
			       System.out.println("modifica effettuata");


	       }
	       else
	       {
	    	   
	    	   
	    	   System.out.println("non trovato");
	    	   
	       }
		
		
	}
	
	
	

	
	
	public void ordinamento(ArrayList<Correntista> correntisti) {
		
		
		    for(int i = 0; i < correntisti.size(); i++) {
		        boolean flag = false;
		        
		        
		        
		        for(int j = 0; j < correntisti.size()-1; j++) {
		      
// se la prima stringa e piu piccola (nell'alfabeto) della seconda, entra nell if ed effettua lo scambio
     	

		        	
		        	String uno = correntisti.get(j).getCognome();
 		        	 String due = correntisti.get(j+1).getCognome();
		        	 
		        	int comparazione = uno.compareTo(due);
		        	 
		            if(comparazione > 0 ) 
		            {
		            	
		            	 
		            	 Correntista piccolo = correntisti.get(j);
		                 Correntista grande= correntisti.get(j+1) ;
		                 
 						    correntisti.set(j, grande );
 						    correntisti.set(j+1, piccolo );


		                 flag=true; //Lo setto a true per indicare che é avvenuto uno scambio
		                 
		            }
		        } 
		        if(!flag) break; //Se flag=false allora vuol dire che nell' ultima iterazione
		                         //non ci sono stati scambi, quindi il metodo può terminare
		                         //poiché l' array risulta ordinato
		    }
		    
		    
		    
	        System.out.println("stampa in ordine alfabetico iniziata:");

			for(Correntista i : correntisti)
		       {

				
			    System.out.println( i);

		       }
		
		
		
		
		
	}
	
	
public void conto(ArrayList<Correntista> correntisti, ArrayList<ContoCorrente> contocorrente)
{
	System.out.print("digita il codicefiscale di chi possedera il nuovo conto: ");
	  
	  String codicefiscalepossessore= in.nextLine();

	  int i;
	  int posizione = 0;
	  int trovato = 0;
	 int presenti =  correntisti.size();
	 for(i=0; i<presenti; i++)
	 {
	  if( codicefiscalepossessore.equals(correntisti.get(i).getCodicefiscale()))
			  {
		  	trovato = 1;
		  	posizione = i;
		  
			  }
	  
	  
	
	 }
	 
	 
	  if(trovato==1)
	  {

			System.out.print("digita il numero del conto: ");
			  
			  String numerocontonuovo= in.nextLine();
			  
			  int presente =0;
			 int conti =  correntisti.get(posizione).contocorrente.size();
			 for(i=0; i<conti ; i++)
			 {
			  if(numerocontonuovo.equals(correntisti.get(posizione).contocorrente.get(i).getNumeroConto()))
					  {
				  		
				  presente = 1;
				  
					  }
			  
			
	  }
			 
			 
			 if(presente==0)
			 {
				 
				   correntisti.get(posizione).contocorrente.add(new ContoCorrente(numerocontonuovo, 0));
				   System.out.println("inserimento effettuato");
				 
			 }
			 else
			 {
				 
				  	System.out.println("numero conto gia' esistente, inserirne uno diverso");

				 
			 }
			 
			 
	  }
	  else
	  {
		  
		  
		  System.out.println("codice fiscale non esistente, aggiungere utente nella sezione 1 del menu");
		  
		  
	  }
	 
	 
	 
}
	
	public void versare(ArrayList<Correntista> correntisti, ArrayList<ContoCorrente> contocorrente) {
		

		
		
		System.out.println("prima di prelevare bisogna effettuare l'accesso");
		System.out.print("inserisci il tuo username: ");
		  String usernameaccesso = in.nextLine(); 

			
			System.out.print("inserisci la password: ");
		       String passwordaccesso = in.nextLine(); 

		       System.out.print("inserisci il tuo codice fiscale: ");
		       String codicefiscaleaccesso = in.nextLine(); 
		       
		       
		       int trovato=0;
		       int posizione=0;
				for (int i = 0; i < correntisti.size(); i++) {
					
					
				    
		      if(usernameaccesso.equals(correntisti.get(i).getUsername()) && passwordaccesso.equals(correntisti.get(i).getPassword())  && codicefiscaleaccesso.equals(correntisti.get(i).getCodicefiscale()))
				{
					
					trovato=trovato+1;
					posizione=i;
				}
		       
				}
		       
				if(trovato==1)
				{
					
					System.out.println("accesso effettuato");
				
					
					int size = correntisti.get(posizione).contocorrente.size();

					Correntista correntistaccesso = correntisti.get(posizione);

					if(size ==1 )
					{
					
					double saldo = correntistaccesso.contocorrente.get(0).getSaldo();
					
					System.out.println("il suo saldo e' di: " + saldo + " euro.");
					System.out.print("quanto desidera versare?");
					
				       double quantitaversamento = in.nextDouble(); 
				       
				       if(quantitaversamento<0)
				       {
				    	   
				    	   
				    	   System.out.println("scelta non corretta");
				    	   
				       }
				       
				       else {
				       double quantita = quantitaversamento + saldo; 
				       
				       correntistaccesso.contocorrente.get(0).setSaldo(quantita);
				       
				      System.out.println("nuovo saldo: " + quantita + " euro" );
				       }
					}
					
					if(size>1)
					{
						
						
						
						System.out.print("su quale conto desidera versare? ");
					       String numerocontoscelto = in.nextLine(); 
					      int vettoreconti = correntistaccesso.contocorrente.size();
					       int i;
					       int creato=0;
					       for(i=0; i<vettoreconti; i++ )
					       {
					       if(numerocontoscelto.equals(correntistaccesso.contocorrente.get(i).getNumeroConto()))
							{
								
								creato=1;
								posizione = i;
								
							}
					       }
					       
					       if(creato== 1)
					       {
					    	   

								double saldo = correntistaccesso.contocorrente.get(posizione).getSaldo();
								
								System.out.println("il suo saldo e' di: " + saldo + " euro.");
								System.out.print("quanto desidera versare?");
								
							       double quantitaversamento = in.nextDouble(); 
							       
							       if(quantitaversamento<0)
							       {
							    	   
							    	   
							    	   System.out.println("scelta non corretta");
							    	   
							       }
							       
							       else {
							       double quantita = quantitaversamento + saldo; 
							       
							       correntistaccesso.contocorrente.get(posizione).setSaldo(quantita);
							       
							      System.out.println("nuovo saldo: " + quantita + " euro" );
							       }
					       }
						
					       else
					       {
					    	   System.out.println("conto non esistente, creane uno nuovo o visualizza quelli presenti");
					    	   
					       }
						
					}

					if(size==0)
					{
						
						
						System.out.println("per poter prelevare bisogna creare un conto nella sezione 6 del menu");
						
						
					}
					
					
					
					
					
				}
				
				else
				{
					
					
					System.out.println("credenziali errate ");
				}
		
	}
	
	
	
public void prelevare(ArrayList<Correntista> correntisti, ArrayList<ContoCorrente> contocorrente) {
		
		
		System.out.println("prima di prelevare devi fare l'accesso");
		System.out.print("inserisci il tuo username: ");
	       String usernameaccesso = in.nextLine(); 

		
		System.out.print("inserisci la password: ");
	       String passwordaccesso = in.nextLine(); 

	       System.out.print("inserisci il tuo codice fiscale: ");
	       String codicefiscaleaccesso = in.nextLine(); 
	       
	       
	       int trovato=0;
	       int posizione=0;
			for (int i = 0; i < correntisti.size(); i++) {
				
				
			    
	      if(usernameaccesso.equals(correntisti.get(i).getUsername()) && passwordaccesso.equals(correntisti.get(i).getPassword())  && codicefiscaleaccesso.equals(correntisti.get(i).getCodicefiscale()))
			{
				
				trovato=trovato+1;
				posizione=i;
			}
	       
			}
	       
			if(trovato==1)
			{
				
				System.out.println("accesso effettuato");

				
				
				
				
				
				int size = correntisti.get(posizione).contocorrente.size();

				Correntista correntistaccesso = correntisti.get(posizione);

				
				
				if(size == 1 )
				{
				double saldo = correntisti.get(posizione).contocorrente.get(0).getSaldo();
				System.out.println("il suo saldo e' di: " + saldo + "euro");
				if(saldo == 0)
				{
					
					System.out.println("non e' possibile prelevare, saldo insufficiente.");
					
				}
				
				else {
				System.out.print("quanto desidera prelevare??");
			       double quantitarichiesta = in.nextDouble(); 
			       
			       if(quantitarichiesta< saldo && quantitarichiesta>0)
			       {
			       double quantita = saldo -  quantitarichiesta ; 
			       
			       correntisti.get(posizione).contocorrente.get(posizione).setSaldo(quantita);
			       
			      System.out.println("saldo aggiornato: " + quantita );
			       }
			       
			       else {
			    	   
			    	   System.out.println("quantita non disponibile o importo non corretto, prelievo annullato");
			    	   
			       }
				}
				}
				
				if(size>1)
					
				{
					
					

					System.out.print("da quale conto desidera prelevare? ");
				       String numerocontoscelto = in.nextLine(); 
				      int vettoreconti = correntistaccesso.contocorrente.size();
				       int i;
				       int creato=0;
				       for(i=0; i<vettoreconti; i++ )
				       {
				       if(numerocontoscelto.equals(correntistaccesso.contocorrente.get(i).getNumeroConto()))
						{
							
							creato=1;
							posizione = i;
							
						}
				       }
				       
				       if(creato== 1)
				       {
				    	   

							double saldo = correntistaccesso.contocorrente.get(posizione).getSaldo();
							
							System.out.println("il suo saldo e' di: " + saldo + " euro.");
							
							if(saldo ==0)
							{
								
								System.out.println("non e' possibile prelevare, saldo insufficiente.");

								
							}
							
							else {
							System.out.print("quanto desidera prelevare?");

							double quantitarichiesta = in.nextDouble(); 
						       
						       if(quantitarichiesta< saldo && quantitarichiesta>0)
						       {
						       double quantita = saldo -  quantitarichiesta ; 
						       
						       correntistaccesso.contocorrente.get(posizione).setSaldo(quantita);
						       
						      System.out.println("saldo aggiornato: " + quantita );
						       }
						       
						       else {
						    	   
						    	   System.out.println("quantita non disponibile, prelievo annullato");
						    	   
						       }
							}
				       }
					
				       else
				       {
				    	   System.out.println("conto non esistente, creane uno nuovo o visualizza quelli presenti");
				    	   
				       }
					
				}
				
				if(size==0)
				{
					
					
					System.out.println("per poter versare bisogna creare un conto nella sezione 6 del menu");
					
					
				}
				
			}
			
			else
			{
				
				
				System.out.println("credenziali errate ");
			}
	       
	       
	       
		
	}


	
	
	
	
	
	
}
