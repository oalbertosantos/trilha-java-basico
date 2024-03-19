package edu.alberto.terceirasemana;

/* Também usamos o controle de fluxo FOR para interagir sobre ARRAYS e coleções. 
ARRAYS - Conjunto de elementos de um tipo correspondentes, o indice começa em ZERO.
Length - atributo que quer dizer tamanho. */

public class ExemploForArrays {
    
    public static void main(String[] args) {
        
        String alunos [] = {"Carlos", "Laís", "Rebeca", "Antônio"};

        for ( int x = 0; x < alunos.length; x++ ) {
            System.out.println("O aluno no indice x = " + x + " é " + alunos [ x ] );
        }
    }
}
