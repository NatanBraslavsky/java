public class Programa1 {

    public static void contarIterativo(int num){
        for(int i = 0; i <= num; i++){
            System.out.println(i);
        }
    }
    public static void contarRecurssivo(int num){
        if(num < 0){
            return;
        }
        System.out.printf("%d ", num);
        contarRecurssivo(num-1);
    }

    public static void main(String[] args) {
        contarIterativo(5);
        contarRecurssivo(5);
    }
}