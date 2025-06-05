import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String caminho = "texto.txt";
        System.out.print("Digite um texto para salvar no arquivo: ");
        String texto = sc.nextLine();

        // Gravar no arquivo.
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(caminho))){
            writer.write(texto);
            System.out.println("Texto salvo com sucesso");
        } catch( IOException e){
            System.out.println("Erro ao gravar: " + e.getMessage());
        }

        // Ler o conteudo do arquivo
        System.out.println("Conteudo do arquivo: ");
        try(BufferedReader reader = new BufferedReader(new FileReader(caminho))){
            String linha;
            while((linha = reader.readLine()) != null){
                System.out.println(linha);
            }
        } catch(IOException e){
            System.out.println("Erro ao ler: " + e.getMessage());
        }
        sc.close();
    }
}