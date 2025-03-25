package dominio;

public class Aluno {
    public String nome;
    public double nota;
    public boolean validarNota(){
        if (nota >= 0 && nota <= 10){
            return true;
        }
        return false;
    }
    public String classificarAluno(){
        if(nota >= 7){
            return "Aprovado";
        } else if (nota >= 5 && nota < 7) {
            return "Recuperação";
        }
        return "Reprovado";
    }
}
