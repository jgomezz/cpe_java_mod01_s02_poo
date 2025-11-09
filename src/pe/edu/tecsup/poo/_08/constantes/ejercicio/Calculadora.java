package pe.edu.tecsup.poo._08.constantes.ejercicio;

public class Calculadora {

    public static final double PI = 3.1416;

    public static int sumar(int num1, int num2){
        return num1 + num2;
    }

    public int restar(int num1, int num2){
        return num1 - num2;
    }

    public static double areaCirculo(double radio){
        return PI * (radio * radio);
    }
}