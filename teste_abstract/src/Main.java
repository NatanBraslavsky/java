abstract class Animal{
    abstract void sound();
}

class Gato extends Animal{
    void sound(){
        System.out.println("Meow");
    }
}

class Cachorro extends Animal{
    void sound(){
        System.out.println("AuAu");
    }
}

public class Main {
    public static int squad(int a){
        return a*a;
    }
    public static void main(String[] args) {
        Animal gato = new Gato();
        gato.sound();
        Animal cachorro = new Cachorro();
        cachorro.sound();
        int num = 2;
        int quad = squad(num);
        System.out.println(quad);
    }
}