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
        if (!nomes.isEmpty() && nomes.size() == 4) {
            String nomeSorteado = nomeAleatorio(nomes, random);
            for(int i = 0; i < nomes.size(); i++){
                if(nomes.get(i) == nomeSorteado){
                    nomes.remove(i);
                }
            }
            String segundoSorteado = nomeAleatorio(nomes,random);
            for(int i = 0; i < nomes.size(); i++){
                if(nomes.get(i) == nomeSorteado){
                    nomes.remove(i);
                }
            }
            ArrayList<String> novosNomes = new ArrayList<String>();
            for(int i = 0; i < nomes.size(); i++){
                novosNomes.add(nomes.get(i));
            }
            System.out.printf("A dupla será: %s e %s CONTRA %s e %s", nomeSorteado, segundoSorteado, novosNomes.get(0), novosNomes.get(1));
        } else {
            System.out.println("Lista de nomes está incompleta.");
        }
    }

    public static String nomeAleatorio(ArrayList<String> nomes, Random random){
        int indiceAleatorio = random.nextInt(nomes.size());
        return nomes.get(indiceAleatorio);
    }
}