package pe.edu.tecsup.poo._05.sobrecarga.ejercicio;

public class Aplicacion {

    public static void main(String[] args) {

        Multiplicacion m = new Multiplicacion();

        System.out.println(m.multiplicar(3,4));
        System.out.println(m.multiplicar(3.2f,4.1f));


    }
}
