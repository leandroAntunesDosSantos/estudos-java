package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class SomaIntervaloNumerosInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro numero inteiro ");
        int numero2 = scanner.nextInt();

        int maiorNumero;
        int menorNumero;

        if (numero1 >= numero2){
            maiorNumero = numero1;
            menorNumero = numero2;
        }else {
            menorNumero = numero1;
            maiorNumero = numero2;
        }
        int soma = 0;

        for (int i = menorNumero; i <= maiorNumero ; i++) {
            soma += i;
            System.out.println(i);
        }
        System.out.println(soma);
    }
}
