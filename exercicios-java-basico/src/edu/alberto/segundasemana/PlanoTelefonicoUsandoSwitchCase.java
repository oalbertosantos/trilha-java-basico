package edu.alberto.segundasemana;

/* Um cenário no qual é possivel adquar o uso do Switch Case para melhorar o algorítimo. (SEM O USO DO BREAK)

Sistema plano telefônico, requisitos:

03 planos: BASIC, MIDIA, TURBO.
BASIC: 100 minutos de ligação;
MIDIA: 100 minutos de ligação + Whats e Instagram Grátis;
TURBO: 100 minutos de ligação + Whats e Instagram Grátis + 5Gb. Youtube */

public class PlanoTelefonicoUsandoSwitchCase {

    public static void main(String[] args) {
        
        String plano = "X";

        switch (plano) {
            case "T":{
                System.out.println("5Gb Youtube");
            }
                
            case "M":{
                System.out.println("Whats e Instagram Grátis");
            }

            case "B":{
                System.out.println("100 minutos de ligação");
            }

            default:
                System.out.println("Plano não encontrado! Escolha as opções: T, M ou B.");
        } 
    }
    
}
