package pe.edu.tecsup.poo._09.herencia.caso0;

public class WebPassword extends GeneralPassword {

    public void procesar(){

        //String k = keyword;

        // Accediendo al atributo protected de la clase base
        String v = super.version;

        //System.out.println("Keyword: " + k);
        System.out.println("Version: " + v);

        String msg = "Enviame tu DNI";

        String encrypted = super.encrytarWord(msg);

        System.out.println("Mensaje Encriptado: " + encrypted);
    }

}
