package pe.edu.tecsup.poo._06.encapsulamiento.ejercicio;

public class Aplicacion {

    public static void main(String[] args) {

        // estudiante1 :  objeto, instancia

        Persona estudiante1 = new Persona();
        estudiante1.nombre = "Juan";
    //    estudiante1.apellido = "Perez";  // accedes directamente al atributo privado
        estudiante1.setApellido("Perez");   // accedes indirectamente via el setter


//        System.out.println(estudiante1);

//        System.out.println(estudiante1.apellido);
        System.out.println(estudiante1.getApellido());


        Persona estudiante2 = new Persona();
        estudiante2.nombre = "Ana";
    //    estudiante2.apellido = "Gomez";
        estudiante2.setApellido("Gomez");   // accedes indirectamente via el setter

        System.out.println(estudiante2);




    }
}
