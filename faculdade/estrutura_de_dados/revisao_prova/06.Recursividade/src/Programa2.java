public class Programa2 {
    public static void somarNumIterativo(int num){
        int soma = 0;
        for(int i = 1; i <= num; i++){
            soma += i;
        }
        System.out.println(soma);
    }
    public static int somarNumRecursivo(int num){
        if(num <= 0){
            return 0;
        }
        return num + somarNumRecursivo(num-1);
    }

    public static void main(String[] args) {
        somarNumIterativo(3);
    }
}
