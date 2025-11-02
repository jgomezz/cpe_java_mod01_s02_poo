package pe.edu.tecsup.poo._01.declaracion.ejercicio2;

public class Aplicacion {

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.titulo = "Harry Potter";
        libro1.autor = "J. K. Rowling";
        libro1.nroPaginas = 250;
        libro1.precio = 34.90;

        System.out.println(libro1);

        Libro libro2 = new Libro();
        libro2.titulo = "It";
        libro2.autor = "Stephen King";
        libro2.nroPaginas = 180;
        libro2.precio = 28.90;

        System.out.println(libro2);

    }
}
