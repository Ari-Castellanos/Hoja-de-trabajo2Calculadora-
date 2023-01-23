import java.util.*;


public class Main {
    public static void main(String[] args) {
        Leo leo = new Leo();
        int i = 0;
        IPostfixCalculator calculadora = new Calculadora();
        List<String> operaciones = leo.leerArchivo("ejemplo.txt");
        for (String operacion : operaciones) {
            i ++;
            System.out.println("operacion " + i + ":");
            System.out.println(calculadora.Calculate());
        }
    }
}

