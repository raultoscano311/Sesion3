package pkg;

public class Cuenta {
	private String titular;
	private String cuenta;
	private Double saldo;

	public Cuenta(String titular, String cuenta, Double saldo) {
		super();
		this.titular = titular;
		this.cuenta = cuenta;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void ingresar(double i) {
		// TODO Auto-generated method stub
		setSaldo((double) -200);
		

	}

	public void retirar(double i) {
		// TODO Auto-generated method stub
		setSaldo((double) -200);

	}

}
