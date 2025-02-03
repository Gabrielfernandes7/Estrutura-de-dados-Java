package Capitulo06;

public class Fatorial {
    public static void main(String[] args) {
        int fatorialNum = fatorial(5);

        System.out.println(fatorialNum);
    }

    public static int fatorial(int n) {
        if (n==0) {
            return 1;
        } else {
            return (n * fatorial(n - 1)); // recursão
        }
    }
}
