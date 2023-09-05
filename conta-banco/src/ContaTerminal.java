import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanNome = new Scanner(System.in).useDelimiter("\n");
        Scanner scan = new Scanner(System.in);
        ContaEstrutura conta = new ContaEstrutura();

        System.out.println("Cadastro Bancário");
        System.out.println("\nPor favor, digite o número da conta: ");
        conta.numero = scan.nextInt();
        System.out.println("\nPor favor, digite a agência: ");
        conta.agencia = scan.next();
        System.out.println("\nPor favor, digite seu nome: ");
        conta.nomeCliente = scanNome.nextLine();
        System.out.println("\nPor favor, digite seu saldo: ");
        conta.saldo = scan.nextFloat();

        scan.close();
        scanNome.close();
        conta.imprimirMensagem();
    }
}
