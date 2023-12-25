package com.leandro.cursojava.aula17;

public class FibonacciAte500 {
    public static void main(String[] args) {

        int primeiro = 1;
        int segundo = 1;
        int proximo = 0;


        while (proximo <= 500){
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            System.out.println(proximo);
        }
        System.out.println(proximo);
    }
}
