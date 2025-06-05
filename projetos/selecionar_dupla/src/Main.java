import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        String caminho = "src/nomes.txt";
        Random random = new Random();

        try(BufferedReader reader = new BufferedReader(new FileReader(caminho))){
         String linha;
         while((linha = reader.readLine()) != null){
             nomes.add(linha);
         }
        } catch(IOException e){
            e.printStackTrace();
        }
        if (!nomes.isEmpty()) {
            String nomeSorteado = nomeAleatorio(nomes, random);
            System.out.println("Nome sorteado: " + nomeSorteado);
        } else {
            System.out.println("Lista de nomes está vazia.");
        }
    }

    public static String nomeAleatorio(ArrayList<String> nomes, Random random){
        int indiceAleatorio = random.nextInt(nomes.size());
        return nomes.get(indiceAleatorio);
    }
}