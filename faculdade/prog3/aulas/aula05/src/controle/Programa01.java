package controle;

import dominio.Animal;

import java.util.Iterator;
import java.util.Vector;

public class Programa01 {
    public static void main(String[] args) {
        Vector<Animal> animais = new Vector<Animal>();
        animais.add(new Animal("Betinha", "Canina", "Street Dog"));
        animais.add(new Animal("Pachola", "Canina", "Street Dog"));
        animais.add(new Animal("Mel", "Canina", "Poodle"));
        animais.add(new Animal("Luana", "Canina", "Street Dog"));
        animais.add(new Animal("Solange", "Canina", "Street Dog"));

        Iterator iterator = animais.iterator();
        while(iterator.hasNext()){
            Animal animal = (Animal) iterator.next();
            System.out.println(animal.getNome() + " | " + animal.getEspecie() + " | " + animal.getRaca());
        }
    }
}
