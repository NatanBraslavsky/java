package dominio;

public class Elevador {
    public int andarAtual = 0;
    public int totalAndares = 10;
    public void subir(){
        if (andarAtual < totalAndares){
            andarAtual+=1;
        }
        else{
            System.out.println("Você já está no último andar.");
        }
    }

    public void descer(){
        if(andarAtual == 0){
            System.out.println("Você já está no primeiro andar. ");
        }
        else{
            andarAtual-=1;
        }
    }

    public void exibirAndar(){
        System.out.printf("Andar: %d", andarAtual);
    }
}
