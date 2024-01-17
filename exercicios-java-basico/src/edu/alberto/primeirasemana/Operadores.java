package edu.alberto.primeirasemana;

import java.util.Date;

public class Operadores {
    public static void main(String[] args) {

    // Atribuição:

        String nome = "Carlos";

        int idade = 32;

        double peso = 92.5;

        char sexo = 'M';

        boolean doadorOrgao = false;

        Date dataNascimento = new Date();


    // Aritméticos:
        
        double soma = 10.5 + 15.7;
        
    // O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a "concatenação de textos".

        int subtracao = 113-25;

        int multiplicacao = 5 * 4;

        int divisao = 15 / 3;

        int modulo = 18 % 3;

        double resultado = (10/7) + (20*4);

    // Repetição:

        int numero = 5;

        //numero = numero + 2; ou

        numero ++;

        System.out.println(numero);

    // Boolean, negação:

        boolean variavel = false;

        variavel = !variavel; //inversão

        System.out.println(variavel);

        
    }
    
}
