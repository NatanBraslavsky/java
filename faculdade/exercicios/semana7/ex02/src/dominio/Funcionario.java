package dominio;

public class Funcionario {
    public String nome;
    public double salarioBase;
    public String categoria;
    public void calcularSalarioFinal(){
        double salarioFinal = salarioBase;
        switch (categoria){
            case "A":
                salarioFinal += salarioBase * 0.2;
                break;
            case "B":
                salarioFinal += salarioBase * 0.1;
                break;
            case "C":
                salarioFinal += salarioBase * 0;
                break;
            default:
                System.out.println("valor inválido");

        }
        System.out.println("Salário final R$"+salarioFinal);
    }
}
