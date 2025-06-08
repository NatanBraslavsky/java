import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String arquivo = "src/dados.txt";
        int numeroDePalavras = 0;

        try(BufferedReader reader = new BufferedReader(new FileReader(arquivo))){
            String linha;

            while((linha = reader.readLine()) != null){
                String[] palavras = linha.split("\\s+");
                numeroDePalavras+=palavras.length;
            }
            System.out.printf("Número total de palavras: %d", numeroDePalavras);
        } catch(IOException e){
            System.out.println("Erro ao ler o arquivo: "+ e.getMessage());
        }
    }
}