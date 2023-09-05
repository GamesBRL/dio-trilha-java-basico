import java.text.DecimalFormat;

public class ContaEstrutura {
    
    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;
    private String mensagem;

    public void imprimirMensagem(){
        DecimalFormat formataDecimal = new DecimalFormat("0.00");

        this.mensagem = "\nOlá ".concat(this.nomeCliente);
        this.mensagem = this.mensagem.concat(", obrigado por criar uma conta em nosso banco");
        this.mensagem = this.mensagem.concat(", sua agência é ").concat(this.agencia);
        this.mensagem = this.mensagem.concat(", conta ") + (int)this.numero;
        this.mensagem = this.mensagem.concat(" e seu saldo ") + formataDecimal.format(this.saldo);
        this.mensagem = this.mensagem.concat(" já está disponível para saque.");
        System.out.println(this.mensagem);
    }

}