package Capitulo02;
import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // lista ordenada
        int[] numeros = { 1, 2, 4, 5, 6, 9, 10 };
        
        int indiceInferior = 0;
        int indiceSuperior = numeros.length - 1;
        
        System.out.println("Digite o número que você deseja obter");
        int numeroBuscado = input.nextInt();
        
        while (indiceInferior <= indiceSuperior) {
            int indiceMeio = (indiceSuperior + indiceInferior) / 2;

            if (numeroBuscado == numeros[indiceMeio]) {
                System.out.println("Número encontrado na posição " + indiceMeio);
                break;
            } else if (numeroBuscado < numeros[indiceMeio]) {
                indiceSuperior = indiceMeio - 1;
            } else if (numeroBuscado > numeros[indiceMeio]) {
                indiceInferior = indiceMeio + 1;
            } else {
                System.out.println("Número não encontrado");
            }
        }

        input.close();
    }
}
