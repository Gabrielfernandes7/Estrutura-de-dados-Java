package Capitulo04.pilha.exemploPilha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnalisadorSintaticoApp {
    public static void main(String[] args) throws IOException {

        String input;

        while (true) {
            System.out.println("Entre com uma frase ou expressão delimitada pos (), {}, []");

            System.out.flush();
            input = getString();

            if (input.equals("")) { // sair do loop se ENTER
                break;
            }

            AnalisadorSintatico analisadorSintatico = new AnalisadorSintatico(input);
            analisadorSintatico.check(); // testar os colchetes
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();

        return s;
    }
}
