public class Calculadora<T> implements IPostfixCalculator<T> {
    

    public Calculadora() {

    }

    @Override
    public int Calculate(java.util.ArrayList<T> postfix_expression) throws Exception{

        int respuesta = 0;
        StackHandmade<Integer> numeros = new StackHandmade<Integer>();

        try{
            for (T u : postfix_expression){
                if (u instanceof String){
                    char v = ((String) u).charAt(0);
                }
                else{
                    char v = (char) u;
                }
                if ( v.isDigit() ){
		            numeros.push(Integer.parseInt(v));
                }
                switch (v){
                    case "+":
                        respuesta = numeros.pull() + numeros.pull();
                        numeros.push(respuesta);
                        break;

                    case "-":
                        respuesta = numeros.pull() - numeros.pull();
                        numeros.push(respuesta);
                        break;

                    case "*":
                        respuesta = numeros.pull() * numeros.pull();
                        numeros.push(respuesta);
                        break;

                    case "/":
                        respuesta = numeros.pull() / numeros.pull();
                        numeros.push(respuesta);
                        break;
                    
                    case " ":
                    break;

                    default:
                        System.out.println("caracterinvalido en la linea, no se tomara en cuenta en el calculo");

                        //dar resultado


                }

            }
        }
        catch (Exception ex){

        }

        return respuesta;
    }





}
