package Auxiliatura;
public class CuentaBancaria {
	    private String titular;
	    private String nroCuenta;
	    private double saldo;
	    public CuentaBancaria(String titular, String nroCuenta, double saldo) {
	        this.titular = titular;
	        this.nroCuenta = nroCuenta;
	        this.saldo = saldo;
	    }
	    public void depositar(double monto) {
	        if (monto <= 0) {
	            System.out.println("Error... debe ser un monto mayor a 0");
	        } else {
	            saldo = saldo + monto;
	            System.out.println("Depósito realizado correctamente");
	        }
	    }
	    public void retirar(double monto) {
	        if (monto > saldo) {
	            System.out.println("Error: No tiene tanto dinero");
	        } else if (monto <= 0) {
	            System.out.println("Error... debe ser un monto mayor a 0");
	        } else {
	            saldo = saldo - monto;
	            System.out.println("Retiro realizado correctamente");
	        }
	    }
	    public void mostrarDatos() {
	        System.out.println("Titular: " + titular);
	        System.out.println("Número de cuenta: " + nroCuenta);
	        System.out.println("Saldo: Bs.- " + saldo);
	    }
	}

