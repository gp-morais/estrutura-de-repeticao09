import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exercicio2au9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, resultado;
        int counter = 0;
        int resposta = 1;

        while (resposta ==1) {
            System.out.print("Informe um valor inteiro: ");
            valor = teclado.nextInt();
            counter=0;
            while (counter <=10) {
                resultado = valor * counter;
                System.out.println(valor + " x " + counter + " = " + resultado);
                counter++;
            }
            System.out.print("Digiter (1) para nova tabuada ou (0) para finalizar");
            resposta = teclado.nextInt();

        }
    }
}
