import java.util.*;


public class Main {
    public static void main(String[] args) {
        Leo leo = new Leo();
        int i = 0;
        IPostfixCalculator calculadora = new Calculadora();
        // leer el archivo
        ArrayList<String> operaciones = leo.leerArchivo("ejemplo.txt");
        //se recorre cada linea del archivo
        for (String operacion : operaciones) {
            i ++;
            //se calcula expresión en formato Postfix de la linea i empieza en 1
            System.out.println("operacion " + i + ":");
            try{
                System.out.println(calculadora.Calculate(operacion));
            }
            catch (Exception ex){
                System.out.println("Error operacion invalida");
            }

        }
    }
}

