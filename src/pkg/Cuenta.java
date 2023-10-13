package pkg;

import java.util.ArrayList;
import java.util.List;

import pkg.Movimiento.Signo;

public class Cuenta {
	private String titular;
	private String cuenta;
	private Double saldo;
	private List<Movimiento> movimientos;

	public Cuenta(String titular, String cuenta, Double saldo) {
		super();
		this.titular = titular;
		this.cuenta = cuenta;
		this.saldo = saldo;
		this.movimientos = new ArrayList<>();
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
		setSaldo(getSaldo() + i);
		String detalles = "Ingreso de "+ i + "€ de la cuenta "+getCuenta();
		System.out.println(detalles);
		Movimiento mov = new Movimiento(i, detalles, Signo.H);
		movimientos.add(mov);
	}

	public void retirar(double i) {
		// TODO Auto-generated method stub
		if (getSaldo() - i >= -500) {
			setSaldo(getSaldo() - i);
			String detalles = "Reintegro de "+ i + "€ de la cuenta "+getCuenta();
			System.out.println(detalles);
			Movimiento mov = new Movimiento(i, detalles, Signo.D);
			movimientos.add(mov);
		} else {
			System.out.println("Fondos insuficientes (Saldo:" + getSaldo() + "€) en la cuenta " + getCuenta() + " para el reintegro de " + i +"€");

		}

	}

}
