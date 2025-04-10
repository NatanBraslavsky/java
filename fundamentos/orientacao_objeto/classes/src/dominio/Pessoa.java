package dominio;

public class Pessoa {
    public String nome;
    public int idade;
    public float altura;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public Pessoa(String n, int i, float a){
        nome = n;
        idade = i;
        altura = a;
    }
}


