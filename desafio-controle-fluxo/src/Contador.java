import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int numeroUm;
        int numeroDois;

        System.out.println("Insira o número 1: ");
        numeroUm = scan.nextInt();
        System.out.println("\nInsira o número 2: ");
        numeroDois = scan.nextInt();
        System.out.println("");

        try{
            contar(numeroUm, numeroDois);
        }catch(ParametrosInvalidosException e){
            System.err.println("O segundo parametro deve ser maior que o primeiro!!");
        }
        scan.close();
    }

    public static void contar(int n1, int n2) throws ParametrosInvalidosException{
        //verificação
        if(n1>n2){
            throw new ParametrosInvalidosException();
        }
        //restante do void
        int contar = n2 - n1;
        for(int i=0;i<contar;i++){
            System.out.println("Imprimindo o número " + (i+1));
        }
    }

}