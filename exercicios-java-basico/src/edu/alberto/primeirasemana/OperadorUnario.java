/* Operadores Unários:

 Aplicado juntamente com um outro operador aritmético. Realizam trabalhos básicos como: incrementar, decrementar, inverter valores númericos e booleanos. 

 Operador de valor positivo (+): os números são positivos sem esse operador explicitamente;

 Operador de valor negativo (-): nega um numero ou expressão aritmética;

 Unário de incremento (++): incrementa o valro em uma unidade;

 Unário de decremento (--): decrementa o valor em uma unidade;

 Lógico de negação: nega o valor de uma expressão booleana.
 */

package edu.alberto.primeirasemana;

// Ex.:

public class OperadorUnario {
    public static void main(String[] args) {
        int numero = 5;

        numero = - numero;

        System.out.println(numero);


// Incremento de valor.:

// xx repetição 

        int valor = 5;

        valor = valor +2;

        valor++; //outra forma mais resumida. Incrementar.

        System.out.println(valor);

// decremento de valor:

        int valorDois = 6;

        valorDois = valorDois +2;

        valorDois--; //outra forma mais resumida. Decrementar.

        System.out.println(valorDois);

// Booleano:

        boolean variavel = false;

        System.out.println(!variavel); // negação


    }
}