package excepciones;

//OJO extiende de la clase Exception
public class OperacionExcepcion extends Exception{
    /*SIEMPRE DEBEN SER MANAJADAS, (tener un bloque try catch)
    HAy otro bloque Try-Catch-Finally*/

    public OperacionExcepcion(String mensaje) {
        super(mensaje);
    }
    
   
}
