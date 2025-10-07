package controle;
import java.util.ArrayList;

public class Programa02 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Juan");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Antonio");
        System.out.println(nomes);
        nomes.add(2, "Mariana");
        System.out.println(nomes);
        nomes.set(3, "Gabriel");
        System.out.println(nomes);
        System.out.println(nomes.get(nomes.size()-1));
    }
}
