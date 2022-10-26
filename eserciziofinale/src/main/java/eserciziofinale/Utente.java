package eserciziofinale;

public abstract class Utente {

	private String password;
	private String username;
	
	
	public Utente() {
		
		
		
		
	}
	

	public Utente(String password, String username) {
		
		this.username= username;
		this.password=password;
		
		
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}


	@Override
	public String toString() {
		return "Utente [password=" + password + ", username=" + username + "]";
	}
	
	
	
}
