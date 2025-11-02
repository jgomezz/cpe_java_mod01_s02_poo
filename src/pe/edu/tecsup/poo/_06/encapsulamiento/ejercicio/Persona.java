package pe.edu.tecsup.poo._06.encapsulamiento.ejercicio;

public class Persona {

    String nombre;
    private String apellido;
    int edad;
    String dni;

    // Getter y Setter para el atributo apellido
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getApellido() {
        return this.apellido;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                '}';
    }
}
