package pe.edu.tecsup.poo._01.declaracion.ejercicio2;

public class Libro{
    String titulo;
    String autor;
    int nroPaginas;
    double precio;


    public String toString() {
        return "Titulo: " + titulo + ", autor: " + autor + ", paginas: " + nroPaginas + ", precio: $" + precio;
    }

}