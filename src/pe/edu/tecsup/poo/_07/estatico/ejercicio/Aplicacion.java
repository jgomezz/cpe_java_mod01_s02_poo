package pe.edu.tecsup.poo._07.estatico.ejercicio;

public class Aplicacion {

    public static void main(String[] args) {

        int nroVeces = 2;
        String mensaje = "Hola Mundo";

        imprimirMensaje(mensaje, nroVeces);

        // Paso 1 : Instanciar la clase Aplicacion
        Aplicacion app = new Aplicacion();
        // Paso 2 : Llamar al metodo no estatico
        app.imprimirOtroMensaje(mensaje);

    }

    public static void imprimirMensaje(String msg, int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.printf("Desde metodo estatico : %s \n", msg);
        }
    }

    public void imprimirOtroMensaje(String msg) {
        System.out.printf("Desde metodo no estatico : %s", msg);
    }

}
