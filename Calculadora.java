import java.util.ArrayList;

public class Calculadora<T> implements IPostfixCalculator<T> {


    public Calculadora() {

    }

    /**
     * Es el metodo que calcula
     * @param postfix_expression calculo de enteros en postfix
     * @return resultado
     * @throws Exception
     */
    @Override
    public int Calculate(ArrayList<T> postfix_expression) throws Exception{

        int respuesta = 0;
        StackHandmade<Integer> numeros = new StackHandmade<Integer>();


        for (T u : postfix_expression){

            char v = (char) u;
            if ( Character.isDigit(v) ){
                numeros.push(Integer.parseInt(String.valueOf(v)));
            }
            switch (v){
                case '+':
                    respuesta = numeros.pull() + numeros.pull();
                    numeros.push(respuesta);
                    break;

                case '-':
                    respuesta = numeros.pull() - numeros.pull();
                    numeros.push(respuesta);
                    break;

                case '*':
                    respuesta = numeros.pull() * numeros.pull();
                    numeros.push(respuesta);
                    break;

                case '/':
                    respuesta = numeros.pull() / numeros.pull();
                    numeros.push(respuesta);
                    break;

                case ' ':
                    break;

                default:
                   // System.out.println("caracterinvalido en la linea, no se tomara en cuenta en el calculo");

                    //dar resultado


                }


            }

        return numeros.pull();
    }





}

