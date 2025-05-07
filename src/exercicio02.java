import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valor, maior, contador;

                contador=1;
                maior=;

        while(contador<=10){
            System.out.print("Digite um valor: ");
            valor = teclado.nextInt();
            if (valor>maior){
                maior=valor;
            }
            contador++; //contador = contador + 1

        }
        System.out.print("O maior número é: "+maior);
    }
}
