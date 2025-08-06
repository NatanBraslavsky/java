package controller;

import model.Automovel;
import data.AutomovelDAO;

import java.util.*;

public class AutomovelController {
    private ArrayList<Automovel> lista = new ArrayList<>();

    public AutomovelController() {
        lista = AutomovelDAO.carregar();
    }

    public void incluir(Automovel a) {
        if (buscar(a.getPlaca()) == null) {
            lista.add(a);
            System.out.println("Automóvel incluído.");
        } else {
            System.out.println("Placa já cadastrada.");
        }
    }

    public void remover(String placa) {
        Automovel a = buscar(placa);
        if (a != null) {
            lista.remove(a);
            System.out.println("Automóvel removido.");
        } else {
            System.out.println("Automóvel não encontrado.");
        }
    }

    public void alterar(String placa, String modelo, String marca, int ano, double valor) {
        Automovel a = buscar(placa);
        if (a != null) {
            a.setModelo(modelo);
            a.setMarca(marca);
            a.setAno(ano);
            a.setValor(valor);
            System.out.println("Dados alterados.");
        } else {
            System.out.println("Automóvel não encontrado.");
        }
    }

    public Automovel buscar(String placa) {
        for (Automovel a : lista) {
            if (a.getPlaca().equalsIgnoreCase(placa)) {
                return a;
            }
        }
        return null;
    }

    public void listarOrdenado(int tipo) {
        Comparator<Automovel> comp = switch (tipo) {
            case 1 -> Comparator.comparing(Automovel::getPlaca);
            case 2 -> Comparator.comparing(Automovel::getModelo);
            case 3 -> Comparator.comparing(Automovel::getMarca);
            default -> null;
        };
        if (comp == null) {
            System.out.println("Tipo inválido.");
            return;
        }

        ArrayList<Automovel> copia = new ArrayList<>(lista);
        copia.sort(comp);
        for (Automovel a : copia) {
            System.out.println(a);
        }
    }

    public void salvar() {
        AutomovelDAO.salvar(lista);
    }
}
