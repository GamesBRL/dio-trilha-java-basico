public class TiposOperadores {
    
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao ="?";
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        int numero = 5;
        System.out.println(numero);
        numero = -numero;
        System.out.println(numero);
        numero = numero * -1;
        System.out.println(numero);

        boolean variavel = true;
        System.out.println(!variavel);

        int numero1,numero2;
        numero1 = 2;
        numero2 = 2;
        if(numero1==numero2){
            System.out.println("VERDADEIRO");
        }
        else{
            System.out.println("FALSO");
        }

        String verificacao = numero1==numero2 ? "Verdadeiro" : "Falso";
        int resultado = numero1==numero2 ? 1 : 2;
        System.out.println(verificacao);
        System.out.println(resultado);

        int num1 = 2;
        int num2 = 3;
        if(num1>num2){
            System.out.println("Numero 1 é maior ou igual ao Numero 2");
        }
        else if(num1<num2){
            System.out.println("Numero 1 é menor que Numero 2");
        }

    }
}
