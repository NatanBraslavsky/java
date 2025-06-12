package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class VeiculoController {
    private List<Veiculo> veiculos = new ArrayList<>();

    public void adicionarVeiculo(Veiculo v) {
        veiculos.add(v);
    }

    public List<Veiculo> listarVeiculos() {
        return veiculos;
    }
}
