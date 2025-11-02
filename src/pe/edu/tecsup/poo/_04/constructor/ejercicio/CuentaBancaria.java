package pe.edu.tecsup.poo._04.constructor.ejercicio;

public class CuentaBancaria {
    String numeroCuenta;
    String nombreTitular;
    double saldo;

    public String obtenerNumeroCuenta() {
        return this.numeroCuenta;
    }

    public double obtenerSaldoActual(){
        return this.saldo;
    }

    public void realizarPago( double montoPago){
        this.saldo -= montoPago;
    }

    public void depositar(){
        this.saldo += 2000;

    }

    @Override
    public String toString() {
        return "Numero de cuenta: '" + numeroCuenta + '\'' +
                ", nombre del titular: '" + nombreTitular + '\'' +
                ", saldo: " + saldo;
    }



}
