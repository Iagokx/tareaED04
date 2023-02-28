package cuentas;

/**
 * Clase CCuenta que ejecuta las operaciones que imprime Main.java
 * 
 * @author Iago
 * @version 1.0
 * @since 1.0
 */
public class CCuenta {

	private String getNombre() {
		// Getter del atributo nombre
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getTipoInterés() {
		return tipoInterés;
	}

	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInterés;

	public CCuenta() {
	}

	/**
	 * Lista de parámetros:
	 * 
	 * @param nom  Nombre del usuario (String)
	 * @param cue  Nombre de la cuenta (String)
	 * @param sal  Valor de la cuenta (Double)
	 * @param tipo Valor del interés (Double)
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
	}

	/**
	 * Devuelve el saldo de la Cuenta
	 * 
	 * @return Saldo
	 */
	public double estado() {
		return saldo;
	}

	/**
	 * Método que ingresa el parametro cantidad si es mayor a 0.
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	/**
	 * Método que retira el parametro cantidad si es mayor a 0 y el saldo es
	 * suficiente.
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		saldo = saldo - cantidad;
	}
}
