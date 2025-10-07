public class Programa3 {
    public static int fatorarIterativo(int num){
        int fatorial = 1;
        for(int i = 1; i <= num; i++){
            fatorial *= i;
        }
        return fatorial;
    }
    public static int fatorarRecursivo(int num){
        if(num <= 1){
            return 1;
        }
        return num * fatorarIterativo(num-1);
    }

    public static void main(String[] args) {
        System.out.println(fatorarIterativo(5));
        System.out.println(fatorarRecursivo(5));
    }
}
