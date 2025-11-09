package pe.edu.tecsup.poo._07.estatico.ejercicio2;



public class Aplicacion {

    /**
     *  static : no necesita ser instanciado
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Iniciando programa ...!");

        Aplicacion app = new Aplicacion();
        app.imprimirModelo();

        // Llamada a metodo estatico
        Telefono.imprimirModelo();

        // Llamada a metodo no estatico requiere instanciar
        Telefono tlf = new Telefono();
        tlf.imprimirMarca();

    }

    public  void imprimirModelo() {
        System.out.println("Modelo: Samsung Galaxy S24 Ultra");
    }

}
