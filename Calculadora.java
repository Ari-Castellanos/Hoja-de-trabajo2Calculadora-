public class Calculadora<T> implements IPostfixCalculator<T> {
    private StackHandmade<Integer> numeros = new StackHandmade<>();

    public Calculadora() {

    }

    public int Calculate(java.util.ArrayList<T> postfix_expression) throws Exception{
        int respuesta = 0;

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

                default:



            }

        }
        return numeros.pull();
    }





}
