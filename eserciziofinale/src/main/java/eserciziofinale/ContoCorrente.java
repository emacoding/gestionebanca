package eserciziofinale;

public class ContoCorrente {

	
	private String numeroConto;
	private double saldo;
	
	

	
	public ContoCorrente() {
		
		
		
	}
	
	public ContoCorrente(String numeroConto, double saldo) {
		
		this.numeroConto = numeroConto;
		this.saldo = saldo;
		
		
	}
	
	
	
	public String getNumeroConto() {
		return numeroConto;
	}
	public void setNumeroConto(String numeroConto) {
		this.numeroConto = numeroConto;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	@Override
	public String toString() {
		return "numeroConto=" + numeroConto + ", saldo=" + saldo;
	}
	
	
	
	
	
	
	
	
	
}
