package com.company;

import com.company.models.Empresa;
import com.company.models.Item;
import com.company.models.Produto;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    public static void main(String[] args) {
        Integer[] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};
        System.out.println("Exercício 1: ");
        System.out.println("Array em ordem crescente:");
        Arrays.sort(array);
        System.out.print(" - ");
        for (Integer i: array) {
            System.out.print(i + " - ");
        }
        System.out.println();

        System.out.println("Array em ordem decrescente:");
        Arrays.sort(array, Collections.reverseOrder());
        System.out.print(" - ");
        for (Integer i: array) {
            System.out.print(i + " - ");
        }
        System.out.println();


        /////////////////////////////////


        System.out.println();
        System.out.println("Exercício 2:");
        Empresa empresaX = new Empresa("Empresa X", 1.13, 2.48);
        Empresa empresaY = new Empresa("Empresa Y", 18.4, 1.32);

        double novoValorEmpresaX, novoValorEmpresaY;
        int contador = 2021;
        System.out.println(empresaX.getNome() + " - 01/01/" + contador + " - Valor da empresa: " + df2.format(empresaX.getValor()) + "m");
        System.out.println(empresaY.getNome() + " - 01/01/" + contador + " - Valor da empresa: " + df2.format(empresaY.getValor()) + "m");

        while (empresaX.getValor() < empresaY.getValor()) {
            contador++;
            System.out.println();
            novoValorEmpresaX = empresaX.getValor() * empresaX.getCrescimentoAnual();
            empresaX.setValor(novoValorEmpresaX);
            System.out.println(empresaX.getNome() + " - 01/01/" + contador + " - Valor da empresa: " + df2.format(empresaX.getValor()) + "m");

            novoValorEmpresaY = empresaY.getValor() * empresaY.getCrescimentoAnual();
            empresaY.setValor(novoValorEmpresaY);
            System.out.println(empresaY.getNome() + " - 01/01/" + contador + " - Valor da empresa: " + df2.format(empresaY.getValor()) + "m");
        }

        ////////////////////////////////
        System.out.println();
        System.out.println("Exercício 3:");

        Scanner scanner = new Scanner(System.in);

        String nomeProduto;
        double valorProduto;
        int quantidadeProduto;

        Item[] arrayDeItens = new Item[3];

        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Digite o nome do produto " + (i + 1) + ":");
                nomeProduto = scanner.nextLine();

                System.out.println("Digite o valor do produto " + (i + 1) + ":");
                valorProduto = Double.parseDouble(scanner.nextLine());

                System.out.println("Digite a quantidade do produto " + (i + 1) + ":");
                quantidadeProduto = scanner.nextInt();
                scanner.nextLine();

                Produto produto = new Produto(nomeProduto, valorProduto);
                Item item = new Item(produto, quantidadeProduto);

                arrayDeItens[i] = item;

            }
        }   catch (InputMismatchException e) {
                e.printStackTrace();
        }

        contador = 0;
        double valor = 0;
        double valorTotal = 0;

        for (Item i: arrayDeItens) {
            System.out.println("Produto " + (contador+1) );
            System.out.println(i.getProduto().getNome());
            System.out.println("R$" + i.getProduto().getValor());
            System.out.println("Quantidade:  " + i.getQuantidade());

            valor = i.getProduto().getValor() * i.getQuantidade();
            valorTotal += valor;
            System.out.println();
        }
        System.out.println("Valor Total: " + valorTotal);

    }
}
