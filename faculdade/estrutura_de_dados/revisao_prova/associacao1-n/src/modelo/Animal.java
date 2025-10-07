package modelo;

public class Animal{
    private String raca, nome;
    private Cliente cliente;

    public Animal(String raca, String nome){
        this.raca = raca;
        this.nome = nome;
    }

    public String getRaca(){
        return raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
}