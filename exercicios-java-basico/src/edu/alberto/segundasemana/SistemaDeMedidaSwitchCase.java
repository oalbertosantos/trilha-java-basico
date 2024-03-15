package edu.alberto.segundasemana;

//Switch Case - compara o valor de cada caso com o da variável sequencialmente, e sempre que encontra um valor correspondente, executa o código associado ao caso. Para evitar que as comparações continuem a ser executadas acrescentamos um BREAK, após um caso correspondente ter sido encontrado, no final de cada bloco de código. O comando BREAK quando executado, encerra a execução da estrutura onde ele se encontra.

public class SistemaDeMedidaSwitchCase {
    
    public static void main(String[] args) {
        
        String sigla = "X";

        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
                
            case "M":{
                System.out.println("MÉDIO");
                break;
            }

            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        } 
    }
}
