import java.util.Scanner;

//Faça um programa que leia um número e imprima qual dia da semana de acordo com o
//número lido usando o vetor: [Domingo, Segunda, Treça, Quarta, Quinta, Sexta, Sábado]
public class Main {
    public static void main(String[] args) {

       final String[] diasDaSemana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7");
        int opcao = sc.nextInt();
        System.out.println("Dia correspondente: " + diasDaSemana[opcao-1]);

    }
}