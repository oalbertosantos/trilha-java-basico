package edu.alberto.primeirasemana;

public class Operacoes {
    public static void main(String[] args) {

        String nomeUm = "Carlos";
        String nomeDois = new String("Carlos");

        System.out.println(nomeUm.equals(nomeDois)); // equals = compara conteúdos, compara se o conteúdo dos objetos são iguais.

        int numero1 = 2;
        int numero2 = 2;

        boolean simNao = numero1 == numero2; // igual
        
        if (numero1 < numero2) {  //condicional
            System.out.println("A nossa condição é verdadeira!");
        }

        System.out.println("NumeroUm é igual a NumeroDois? " + simNao);

        simNao = numero1 != numero2; // diferente

        System.out.println("NumeroUm é diferente de NumeroDois? " + simNao);

        simNao = numero1 > numero2; // maior

        System.out.println("NumeroUm é maior que NumeroDois? " + simNao);

        simNao = numero1 < numero2; // menor

        System.out.println("NumeroUm é menor que NumeroDois? " + simNao);

        //Obs.: para números, utilizar operadores relacionais. Para objetos, equals.
    }
}
