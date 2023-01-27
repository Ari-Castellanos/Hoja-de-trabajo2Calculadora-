public class Calculadora<T> implements IPostfixCalculator {
    private StackHandmade<int> numeros = new StackHandmade<int>();

    public Calculadora() {

    }

    public int Calculate(java.util.ArrayList<T> postfix_expression) throws Exception{
        int respuesta = 0;
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
                        // algo
                        break;

                    case "-":
                        // algo
                        break;

                    case "*":
                        // algo
                        break;

                    case "/":
                        // algo
                        break;

                    default:
                        System.out.println("caracterinvalido en la linea, no se tomara en cuenta en el calculo")

                        //dar resultado


                }

            }
        }
        catch (){

        }
        return respuesta;
    }





}
