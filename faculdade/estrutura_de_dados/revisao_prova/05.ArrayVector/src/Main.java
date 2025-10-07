import java.util.ArrayList;
import java.util.Vector;

public class Main{
    public static void main(String[] args){
        ArrayList<String> nomew = new ArrayList<String>();
        Vector lista = new Vector();
        nomew.add("oi");
        nomew.add("Tchau");
        nomew.add(1,"oi");
        nomew.set(2,"gabriel");
        lista.add("oi");
        lista.add(3);
        System.out.println(nomew.get(1));
        System.out.println(lista.get(0));
    }
}