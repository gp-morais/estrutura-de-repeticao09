import java.util.Scanner;

public class exercicio1au9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int counter;
        double maior, valor;
        counter = 1;

        System.out.print("Digite um número: ");
        valor = teclado.nextDouble();
        maior = valor;
        counter ++;

        while (counter<=15){
            System.out.print("Digite um número: ");
            valor = teclado.nextDouble();

            if (valor>maior){
                maior = valor;
            }
            counter ++;
        }
        System.out.print("O maior valor é: "+maior);
        teclado.close();
    }
}
