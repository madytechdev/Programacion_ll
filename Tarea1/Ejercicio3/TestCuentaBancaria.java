package Auxiliatura;
public class TestCuentaBancaria {
	    public static void main(String[] args) {
	        CuentaBancaria cuenta = new CuentaBancaria("Luz Madai", "12345678", 1000);
	        System.out.println("DATOS INICIALES");
	        cuenta.mostrarDatos();
	        System.out.println("\nDEPÓSITO");
	        cuenta.depositar(500);
	        cuenta.mostrarDatos();
	        System.out.println("\nRETIRO");
	        cuenta.retirar(300);
	        cuenta.mostrarDatos();
	        System.out.println("\nRETIRO MAYOR AL SALDO");
	        cuenta.retirar(2000);
	        System.out.println("\nDEPÓSITO NEGATIVO");
	        cuenta.depositar(-100);
	        System.out.println("\nDEPÓSITO IGUAL A 0");
	        cuenta.depositar(0);
	        System.out.println("\nDATOS FINALES");
	        cuenta.mostrarDatos();
	    }
	}
