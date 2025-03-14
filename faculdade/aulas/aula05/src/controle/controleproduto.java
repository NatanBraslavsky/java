package controle;
import dominio.Produto;

public class controleproduto {
    public static void main(String[] args){

        Produto prod1 = new Produto(4567,"Frango",50);
        prod1.listarProduto();

        prod1.setValor(55);

        System.out.println(" ");
        prod1.listarProduto();
    }
}
