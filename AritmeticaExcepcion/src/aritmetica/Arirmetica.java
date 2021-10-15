package aritmetica;

import excepciones.OperacionExcepcion;

public class Arirmetica {

    public static int division(int numerador, int denominador) throws OperacionExcepcion {
        if (denominador == 0) { //OJO el siguiente si throw sin S!
               throw new OperacionExcepcion("División entre 0");
        }
        return numerador / denominador;
    }
}
