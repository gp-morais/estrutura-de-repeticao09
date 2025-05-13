import java.util.Scanner;

public class exemplo3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor1, valor2;

        System.out.print("Digite um número inteiro: ");
        valor1 = teclado.nextInt();
        System.out.print("Digite o segundo número (maior que o primeiro)    : ");
        valor2 = teclado.nextInt();

        if (valor1 >= valor2){
            System.out.print("Digite números válidos conforme exigido");
        } else {
            while (valor1 <= valor2){
                System.out.print(valor1+" ");
                valor1++;

            }
        }


    }
}
