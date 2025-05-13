import java.util.Scanner;

public class Exercicio5au9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int quantidade, counter;
        int x=1,y=1,z;

        System.out.print("Escreva quantos termos devem termos: ");
        quantidade = teclado.nextInt();;
        switch (quantidade) {
            case 2:
                System.out.println(x);
            case 1:
                System.out.println(y);
                break;
            default:
                System.out.print(x+" "+y+" ");
                counter = 3;
                while (counter <= quantidade){
                z=x;
                x=y;
                y=z+x;
                    System.out.println(y+" ");
                    counter ++;

                }


        }







    }
}
