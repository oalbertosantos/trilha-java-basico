package edu.alberto.terceirasemana;

/* Break - significa frear, parar, quebrar, interromper. E é isso que acontece quando o Java encontra esse comando pela frente.
Continue - como o nome diz, ele 'continua' o laço. O comando break interrompe o laço, já o continue interrompe somente a interação atual. */

public class ExemploBreakContinue {
    
    public static void main(String[] args) {

    for ( int numero = 1; numero <= 5; numero ++ ){
        
        if (numero == 3)
            break;

        System.out.println(numero);
    }
        
    }

    /*
    public static void main(String[] args) {

    for ( int numero = 1; numero <= 5; numero ++ ){
        
        if (numero == 3)
            continue;

        System.out.println(numero);
    }
        
    }
    */

}
