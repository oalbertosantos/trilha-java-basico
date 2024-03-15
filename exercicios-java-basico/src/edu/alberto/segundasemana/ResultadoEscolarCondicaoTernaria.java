package edu.alberto.segundasemana;

//Condição ternária - podemos abreviar nosso algorítmico condicional refatorando com o conceito de operador ternário, ex.:

public class ResultadoEscolarCondicaoTernaria {

//Cenário 1:
    public static void main(String[] args) {
        int nota = 2;
        
        String resultado = nota >= 7 ? "Aprovado!" : "Reprovado!";
        
        System.out.println(resultado);
    }
}

/* 
//Cenário 2:
public class ResultadoEscolarCondicaoTernaria {

    public static void main(String[] args) {
        int nota = 6;

        String resultado = nota >= 7 ? "Aprovado!" : nota >= 5 &&  nota < 7 ? "Recuperação!" : "Reprovado!";
        
        System.out.println(resultado);
    }
}
 
*/