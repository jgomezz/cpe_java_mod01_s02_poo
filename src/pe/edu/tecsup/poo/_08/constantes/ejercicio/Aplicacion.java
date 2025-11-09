package pe.edu.tecsup.poo._08.constantes.ejercicio;

/**
 *  Crear el metodo estatico sumar, que permita sumar 2 enteros y retorne el resultado.
 *  Crear el metodo no estatico restar, que permita restar 2 enteros y retorne el resultado.
 *  Ambos metodos deben estar creados en la clase Calculadora.
 *  En la clase Calcular definir la constante PI con el valor 3.1416
 *  y usarla para calcular el area de un circulo.
 *
 */
public class Aplicacion {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Suma: " + Calculadora.sumar(5, 3));
        System.out.println("Resta: " + calculadora.restar(8,2));
        System.out.println("Constante PI: " + Calculadora.PI);
        System.out.println("El area del circulo es: " + Calculadora.areaCirculo(4));

    }
}
