package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

import model.Cachorro;
import model.Produto;
import java.util.ArrayList;

import model.Cachorro;
import model.Animal;
import model.Gato;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            Produto produto = new Produto();

            if(i == 0){
                produto.setId(3);
                produto.setNome("Arroz");
            }
            else if(i == 1){
                produto.setId(2);
                produto.setNome("Feijao");
            }
            else{
                produto.setId(1);
                produto.setNome("Farinha");
            }

            produtos.add(produto);
        }
        for(int i = 0; i < 3; i++){
            System.out.println(produtos.get(i).getId());
            System.out.println(produtos.get(i).getNome());
        }

        String arquivo = "src/arquivo.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(arquivo))){
            String linha;
            while((linha = reader.readLine())!=null){
                System.out.println(linha);
            }
        }
        catch(IOException e){
            System.out.println("Erro ao ler o arquivo:"+e.getMessage());
        }
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))){
            writer.write("Linha1");
            writer.newLine();
            writer.write("Linha2");
        }
        catch(IOException e){
            System.out.println("Erro ao escrever no arquivo:"+e.getMessage());
        }
        Cachorro cachorro = new Cachorro("Nina");
        System.out.println(cachorro.getNome());
    }
}