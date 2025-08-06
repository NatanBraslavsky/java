package dominio;

public class Capta {
    public String Capitalize(String s){
        String resultado = s.substring(0,1).toUpperCase() + s.substring(1);
        return resultado;
    }
}
