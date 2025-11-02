package pe.edu.tecsup.poo._01.declaracion.ejercicio1;

public class Aplicacion {

    public static void main(String[] args) {

        // estudiante1 :  objeto, instancia

        Persona estudiante1 = new Persona();
        estudiante1.nombre = "Juan";
        estudiante1.apellido = "Perez";

        System.out.println("Nombre estudiante 1: " + estudiante1.nombre + " " + estudiante1.apellido);

        Persona estudiante2 = new Persona();
        estudiante2.nombre = "Ana";
        estudiante2.apellido = "Gomez";
        System.out.println("Nombre estudiante 2: " + estudiante2.nombre + " " + estudiante2.apellido);




    }
}
