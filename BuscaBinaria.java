import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = { 1, 2, 4, 5, 6, 9, 10 };
        int meio = numeros.length;

        System.out.println("Digite o número que você deseja obter");
        int numeroBuscado = input.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeroBuscado == numeros[meio]) {
                System.out.print("O número " + numeroBuscado + " foi encontrado na lista");
            } else if (numeroBuscado > numeros[meio]) {
                
            }
        }

        input.close();
    }
}
