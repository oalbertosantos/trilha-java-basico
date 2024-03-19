package edu.alberto.terceirasemana;

/* O uso do FOR/EACH está fortemente relacionado com um cenário onde contenha um array ou coleção, e assim, a interração é baseada aos elementos da coleção.
Obs.: Em arrays, o indice começa em ZERO. */

public class ExemploForEach {
    
    public static void main(String[] args) {
        
        String alunos [] = {"Carlos", "Laís", "Rebeca", "Antônio"};

        for ( String aluno : alunos ) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
