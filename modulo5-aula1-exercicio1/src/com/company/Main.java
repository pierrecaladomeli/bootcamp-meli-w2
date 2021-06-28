package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Exercício 1:");
            System.out.println("Digite quantos números pares você quer mostrar:");


            int quantidade = scanner.nextInt();
            numerosPares(quantidade);
            //////////////////////////////////////////////////
            System.out.println("Exercício 2:");
            System.out.println("\n Digite o número divisor:");
            int divisor = scanner.nextInt();

            System.out.println("Digite a quantidade de números divisíveis por " + divisor + ":");
            quantidade = scanner.nextInt();

            numerosMultiplos(quantidade, divisor);


            //////////////////////////////////////////////////
            System.out.println("Exercício 3:");
            System.out.println("Digite o número para checar se é primo:");
            int numero = scanner.nextInt();
            checarPrimo(numero);

            //////////////////////////////////////////////////
            System.out.println("Exercício 4:");
            System.out.println("Digite a quantidade de números primos a serem mostrados:");
            quantidade = scanner.nextInt();

            primeirosNumerosPrimos(quantidade);

            //////////////////////////////////////////////////
            System.out.println("Exercício 5:");
            System.out.println("Digite o número a ser procurado: (d)");
            int digito = scanner.nextInt();

            System.out.println("Quantas vezes o dígito " + digito + " deve aparecer no número? (m)");
            int quantidadeDigitos = scanner.nextInt();

            System.out.println("Quantos números com essa combinação devem aparecer? (n)");
            int quantidadeCombinacoes = scanner.nextInt();

            ocorrenciaDeDigitos(digito, quantidadeDigitos, quantidadeCombinacoes);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }


    }

    public static void numerosPares (int quantidade){
        System.out.print("- ");
        for (int i = 0; i < quantidade; i++) {
            System.out.print(i * 2 + " - ");
        }
    }

    public static void numerosMultiplos (int quantidade, int divisor) {
        System.out.print("- ");
        for (int i = 0; i < quantidade; i++) {
            System.out.print(i * divisor + " - ");
        }
    }


    public static boolean testarPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void checarPrimo(int numero){
        boolean resposta = testarPrimo(numero);
        if (resposta == true) {
            System.out.println("É primo.");
        } else {
            System.out.println("Não é primo.");
        }
    }

    public static void primeirosNumerosPrimos (int quantidade) {
        System.out.print("- ");
        int contador = 0;
        while (quantidade > 0) {
            if (testarPrimo(contador) == true) {
                System.out.print(contador + " - ");
                quantidade--;
            };
            contador++;
        }
    }

    public static void ocorrenciaDeDigitos (int digito, int quantidadeDigitos, int quantidadeCombinacoes ) {
        System.out.print("- ");
        int contador = 1;

        while (quantidadeCombinacoes > 0) {
            if(checarDigitos(digito, quantidadeDigitos, contador) == true) {
                System.out.print(contador + " - ");
                quantidadeCombinacoes--;
            }

            contador++;
        }
    }

    public static boolean checarDigitos (int digito, int quantidadeDigitos, int numero) {
        String numeroString = Integer.toString(numero);
        char[] listaDigitos = numeroString.toCharArray();

        int contador = 0;

        for(char c: listaDigitos) {
            if (Integer.parseInt(String.valueOf(c)) == digito) {
                contador ++;
            }
        }

        if (contador >= quantidadeDigitos) {
            return true;
        }
        return false;
    }

}
