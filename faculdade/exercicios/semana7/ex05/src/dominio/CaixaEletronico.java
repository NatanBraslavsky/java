package dominio;

public class CaixaEletronico {
    private double saldo = 1000;

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque. O valor deve ser maior que zero.");
        } else if (valor % 10 != 0) {
            System.out.println("Valor inválido para saque. O valor deve ser múltiplo de 10.");
        } else if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
