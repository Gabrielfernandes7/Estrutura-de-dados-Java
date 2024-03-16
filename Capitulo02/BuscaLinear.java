package Capitulo02;
import java.util.Locale;
import java.util.Scanner;

public class BuscaLinear {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int[] numeros = { 1, 2, 3, 4, 5, 6, 7};

        System.out.println("Digite um valor que você deseja buscar na lista");
        int numeroBuscado = input.nextInt();
        
       for (int i = 0; i < numeros.length; i++) {
        if (numeroBuscado == numeros[i]) {
            System.out.println("O número " + numeroBuscado + " foi encontrado na posição " + i);
        }
       }

        input.close();
    }
}