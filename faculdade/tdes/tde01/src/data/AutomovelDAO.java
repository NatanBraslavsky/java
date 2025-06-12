package data;

import model.Automovel;

import java.io.*;
import java.util.ArrayList;

public class AutomovelDAO {
    private static final String ARQUIVO = "automoveis.txt";

    public static ArrayList<Automovel> carregar() {
        ArrayList<Automovel> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                lista.add(Automovel.fromCSV(linha));
            }
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado. Será criado ao salvar.");
        }
        return lista;
    }

    public static void salvar(ArrayList<Automovel> lista) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO))) {
            for (Automovel a : lista) {
                bw.write(a.toCSV());
                bw.newLine();
            }
            System.out.println("Dados salvos.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar.");
        }
    }
}
