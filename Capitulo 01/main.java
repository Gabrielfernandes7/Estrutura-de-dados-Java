import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.print("Java");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro");

        int numeroInteiro = scanner.nextInt();

        System.out.print("Você digitou o número " + numeroInteiro);

        scanner.close();
    }
}