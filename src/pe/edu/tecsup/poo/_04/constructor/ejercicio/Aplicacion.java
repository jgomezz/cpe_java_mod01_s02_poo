package pe.edu.tecsup.poo._04.constructor.ejercicio;

public class Aplicacion {

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria();

        cuenta.numeroCuenta = "4567897987";
        cuenta.nombreTitular = "Juan Perez";
        cuenta.saldo = 5000;

        // Mostrar los datos de la cuenta
        String nroCuenta = cuenta.obtenerNumeroCuenta();
        System.out.println("Numero de cuenta: " + nroCuenta);

        // Realizar un pago de 100 soles
        double pagoLuz = 100;
        cuenta.realizarPago(pagoLuz);

        // Obtener el saldo actual
        double saldoActual = cuenta.obtenerSaldoActual();

        System.out.printf("Saldo actual S/%.2f  \n" , saldoActual);

        // Depositar 2000 soles a tu cuenta y obtener el nuevo saldo
        cuenta.depositar();

        //System.out.println(cuenta);


    }
}
