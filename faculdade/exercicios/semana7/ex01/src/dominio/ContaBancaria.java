package dominio;

public class ContaBancaria {
    String titular;
    public double saldo;

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        saldo -= valor;
    }

    public void exibirValor(){
        System.out.println("Saldo: R$" + saldo);
    }
}


