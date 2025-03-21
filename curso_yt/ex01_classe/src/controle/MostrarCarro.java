package controle;
import dominio.Carro;

public class MostrarCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "bmw";
        carro1.modelo = "320i";
        carro1.ano = 2021;

        carro2.nome = "honda";
        carro2.modelo = "civic";
        carro2.ano = 2019;

        System.out.printf("\n\nCarro 1:\n\nNome: %s\nModelo %s\nAno %d", carro1.nome, carro1.modelo, carro1.ano);
        System.out.printf("\n\n\nCarro 2:\n\nNome: %s\nModelo %s\nAno %d", carro2.nome, carro2.modelo, carro2.ano);

    }
}
