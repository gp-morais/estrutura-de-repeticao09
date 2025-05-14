import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7au9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        DecimalFormat dc = new DecimalFormat("0.00");


        //variáveis
        int nmrContribuentes, nmrDependentes, counter;
        String cpf;
        double rendaMensal, salarioMin, impostoRenda;

        System.out.print("Quantos contribuentes serão consultados? ");
        nmrContribuentes = teclado.nextInt();


        while(nmrContribuentes >=1) {
            System.out.print("Digite o CPF: ");
            cpf = teclado.next();
            System.out.print("Digite o número de depententes: ");
            nmrDependentes = teclado.nextInt();
            System.out.print("Digite o salário mínimo atual: R$");
            salarioMin = teclado.nextDouble();
            System.out.print("Digite sua renda mensal: R$");
            rendaMensal = teclado.nextDouble();

            impostoRenda = (salarioMin*0.05*nmrDependentes);

            if (rendaMensal<=2*salarioMin){
                impostoRenda=0;

            } else if(rendaMensal<=3*salarioMin) {
                impostoRenda = (rendaMensal - impostoRenda)*0.05;

            } else if (rendaMensal<=5*salarioMin){
                impostoRenda = (rendaMensal - impostoRenda)*0.1;
            } else if (rendaMensal<=7*salarioMin){
                impostoRenda = (rendaMensal - impostoRenda)*0.15;
            } else{
                impostoRenda = (rendaMensal - impostoRenda)*0.2;
            }
            System.out.println("O valor cobrado por imposto de renda é: R$"+ dc.format(impostoRenda));
            System.out.println();

            nmrContribuentes--;

        }




    }
}
