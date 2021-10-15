package excepciones;

//OJO extiende de la clase Exception
public class OperacionExcepcion extends Exception{

    public OperacionExcepcion(String mensaje) {
        super(mensaje);
    }
    
   
}
