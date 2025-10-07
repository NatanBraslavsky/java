package modelo;

public class PessoaFisica extends Cliente{
    private String cpf, nome;

    public PessoaFisica(String endereco, String telefone, String cpg, String nome){
        super(endereco, telefone);
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String formatarRegistro(){
        //207-510-247.32
        String cpfFormatado = cpf.substring(0,3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9,11);
        return cpfFormatado;
    }
}