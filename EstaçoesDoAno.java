import java.util.Scanner;

public class EstaçoesDoAno {

    public static void main(String[] args) {
        //Declaração de variáveis
        int mes, num;

         //criação de instância de entrada
         Scanner entrada = new Scanner(System.in);

         //Apresentação
         System.out.println("\n\t\t\t-- Estações do ano --\n");

         //Entrada
         System.out.println("Informe o mês");
         mes = entrada.nextInt();

         System.out.println("Informe o dia");
         num = entrada.nextInt();

         //Processamento
        if ((mes == 3) && (num >= 20)|| (mes == 4) || (mes == 5) || (mes == 6) && (num <= 19 )){
            //Saída
            System.out.println("É outono");
        } else if ((mes == 6) &&  (num >= 20) || (mes == 7) ||(mes == 8) || (mes == 9) && (num <= 21)){
            //Saída
            System.out.println("É Inverno");
        } else if ((mes == 9) && (num >= 21 ) || (mes == 10) || (mes == 11) || (mes == 12) && (num <=20)){
            //Saída
            System.out.print("É Primavera");
        } else if ((mes == 12) && (num >= 22) || (mes == 1) || (mes == 2) || (mes == 3)){
            //saída
            System.out.println("É verão");
            } else {
            System.out.println("Mês " + mes + " incorreto!");
        }
    }
}