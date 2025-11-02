package pe.edu.tecsup.poo._03.metodos;

/**
 *  Clase para metodos matematicos
 * @author mbtec22
 *
 */
public class Matematica {

    // Atributos
    
    int a;
    int b;

    /**
     * Metodo que no retorna valores
     */
    public void imprimirValores() {

        System.out.println("Valor de 'a' es " + a);
        System.out.println("Valor de 'b' es " + b);
        
    }


    /**
     *  Metodo que retorna un valor
     * @return
     */
	public int sumar() {
		int suma = a + b ;
		return suma ;		
	}
	
    /**
     *  Metodo que retorna un valor
     * @return
     */
	public int resta () {
		int resta = a - b ;
		return resta ;		
	}

    /**
     *  Metodo que retorna un valor
     * @return
     */
	public int mult() {
		int mult = a * b ;
		return mult ;		
	}
	

    /**
     *  Metodo que retorna un valor
     * @return
     */
	public float div() {
	
        float div = (float) a / b ;
        return div ;
        
		/*
		BigDecimal divFix = BigDecimal.valueOf(div);
		divFix  = divFix.setScale(2,RoundingMode.DOWN);
		div = divFix.floatValue();
		return div;
		//*/
	}
	
	/**
	 * Metodo que recibe un parametro
	 * @param nro
	 * @return
	 */
	public int cuadrado(int nro) {
	
	    return nro*nro;
	
	}

}
