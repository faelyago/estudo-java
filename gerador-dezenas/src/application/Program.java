package application;

import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Pensando em apostar na loteria? Eu vou te ajudar!");
        System.out.println("Em qual loteria desaja apostar? ");
        System.out.printf("1. Mega-Sena%n2. Lotofacil%n3. Lotomania%n");
        int opcao = sc.nextInt();

        while (opcao != 1 && opcao != 2 && opcao != 3) {
            System.out.println("Opcao invalida!");
            System.out.printf("1. Mega-Sena%n2. Lotofacil%n3. Lotomania%n");
            opcao = sc.nextInt();
        }

        if (opcao == 1) {
            Random gerador = new Random();
            int[] dezenas = new int[6];


            for (int cont = 0; cont < dezenas.length; cont++) {
                dezenas[cont] = gerador.nextInt(60) + 1;
            }
            for (int cont = 0; cont < dezenas.length; cont++) {
                for (int aux = 0; aux < dezenas.length; aux++) {
                    if (cont != aux) {
                        if (dezenas[cont] == dezenas[aux]) {
                            dezenas[aux] = gerador.nextInt(60) + 1;
                        }
                    }
                }
            }

            System.out.println("Seus numeros:");
            for (int cont = 0; cont < dezenas.length; cont++) {
                System.out.printf("%d ", dezenas[cont]);
            }

        } else if (opcao == 2) {
            System.out.print("Quantas dezenas deseja? ");
            int x = sc.nextInt();

            while (x < 15 || x > 18) {
                if (x < 15) {
                    System.out.println("Sao necessarias no minimo 15 dezenas!");
                    System.out.print("Quantas dezenas deseja? ");
                    x = sc.nextInt();
                } else if (x > 18) {
                    System.out.println("O maximo permitido sao 18 dezenas!");
                    System.out.print("Quantas dezenas deseja? ");
                    x = sc.nextInt();
                }
            }

            Random gerador = new Random();
            int[] dezenas = new int[x];

            for (int cont = 0; cont < dezenas.length; cont++) {
                dezenas[cont] = gerador.nextInt(99) + 1;
            }

            for (int cont = 0; cont < dezenas.length; cont++) {
                for (int aux = 0; aux < dezenas.length; aux++) {
                    if (cont != aux) {
                        if (dezenas[cont] == dezenas[aux]) {
                            dezenas[aux] = gerador.nextInt(99) + 1;
                        }
                    }
                }
            }

            System.out.println("Seus numeros:");
            for (int cont = 0; cont < dezenas.length; cont++) {
                System.out.printf("%d ", dezenas[cont]);
            }
        } else if (opcao == 3) {
            Random gerador = new Random();
            int[] dezenas = new int[50];

            for (int cont = 0; cont < dezenas.length; cont++) {
                dezenas[cont] = gerador.nextInt(99) + 1;
            }

            for (int cont = 0; cont < dezenas.length; cont++) {
                for (int aux = 0; aux < dezenas.length; aux++) {
                    if (cont != aux) {
                        if (dezenas[cont] == dezenas[aux]) {
                            dezenas[aux] = gerador.nextInt(99) + 1;
                        }
                    }
                }
            }

            System.out.println("Seus numeros:");
            for (int cont = 0; cont < dezenas.length; cont++) {
                System.out.printf("%d ", dezenas[cont]);
            }

        }

        System.out.println();
        System.out.println("Boa Sorte!");

        sc.close();
    }

}