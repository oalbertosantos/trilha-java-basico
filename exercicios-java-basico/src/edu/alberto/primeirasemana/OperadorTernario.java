/* Operadores Ternários:

Uma forma resumida para definir uma condição e escoher um dentre dois valores. Deve-se pensar em uma condição ternária como se fosse uma condição  "if" normal.

Representados pelos símbolos "?:" na seguinte estrutura: <Expressão condicional> ? <Caso condiçãos seja true> : <Caso condição seja false>

 */

package edu.alberto.primeirasemana;

public class OperadorTernario {
    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 5;

        /*String resultado = "";
        if (a==b)
            resultado = "Verdadeiro";
        else;
        resultado = "Falso";*/

        String resultado = a == b ? "Verdadeiro" : "Falso"; //forma mais resumida

        System.out.println(resultado);
    }
    
}
