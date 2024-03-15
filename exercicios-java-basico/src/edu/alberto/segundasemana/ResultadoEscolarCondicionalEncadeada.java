package edu.alberto.segundasemana;

//Condicionais encadeadas - em um controle de fluxo condicional, nem sempre nos limitamos ao se (if) e ao senão (else), poderemos ter uma terceira ou inumeras condições. Ex.:

public class ResultadoEscolarCondicionalEncadeada {
    
    public static void main(String[] args) {
        
        int nota = 4;

        if (nota >= 7)
        System.out.println("Aprovado!");

        else if (nota >= 5 && nota < 7)
        System.out.println("Prova de Recuperação!");

        else
        System.out.println("Reprovado!");

    }
}