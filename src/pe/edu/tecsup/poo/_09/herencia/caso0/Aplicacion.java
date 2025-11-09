package pe.edu.tecsup.poo._09.herencia.caso0;

public class Aplicacion {

    public static void main(String[] args) {

        WebPassword wp = new WebPassword();
        String msg = "Enviame tu DNI";
        String encrypted = wp.procesar(msg);
        System.out.println("Mensaje Encriptado: " + encrypted);


    }

}
