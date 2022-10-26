package eserciziofinale;

import java.util.ArrayList;


public class Correntista extends Utente{


		 ArrayList<ContoCorrente> contocorrente = new ArrayList<ContoCorrente>();
	
		
	private String nome;
	private String cognome;
	private String codicefiscale;
	

	public Correntista() {
		
		
	}
	
	public Correntista(String nome, String cognome, String codicefiscale, String username, String password) {
		super(username, password);
		
		
		this.nome = nome; 
		this.cognome = cognome; 
		this.codicefiscale = codicefiscale;
		
		
	}

	public ArrayList<ContoCorrente> getConto() {
		return contocorrente;
	}
	public void setConto(ArrayList<ContoCorrente> contocorrente) {
		this.contocorrente = contocorrente;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCodicefiscale() {
		return codicefiscale;
	}
	public void setCodicefiscale(String codicefiscale) {
		this.codicefiscale = codicefiscale;
	}
	
	
	
	
	
	


	
	

	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "nome=" + nome + ", cognome=" + cognome
				+ ", codicefiscale=" + codicefiscale + " " +  contocorrente ;
	}
	
	
	
	
	
	
	
}
