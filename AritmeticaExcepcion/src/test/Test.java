package test;

import static aritmetica.Arirmetica.division;

public class Test {

    public static void main(String[] args) {
        int res = 0;
        try {
            res = division(10, 0);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally { //finally-> Es una extensión de la estructura, se va a ejecutar siempre hay ao no excepción
            System.out.println("Siempre estoy: ");
        }
    }
}
