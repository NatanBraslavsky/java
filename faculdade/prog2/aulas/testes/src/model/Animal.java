package model;

public class Animal {
    private String nome;
    public Animal(String nome){
        this.nome = nome;
    }
    public void Beber(){
        System.out.printf("%s bebeu.", nome);
    }
    public void Comer(){
        System.out.printf("%s comeu.", nome);
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}
