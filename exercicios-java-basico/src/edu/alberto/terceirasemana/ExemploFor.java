package edu.alberto.terceirasemana;

//O comando FOR permite que uma variável contadora seja testada e incrementada a cada interação, sendo essas informações definidas na chamada do comando. O comando FOR recebe como entrada uma variável contadora, a condição e o valor de incrementação. Ex.:

public class ExemploFor {

    public static void main(String[] args) {
        
        for ( int carneirinhos = 1; carneirinhos <= 20; carneirinhos ++ ){
            System.out.println("Contando carneirinhos" + carneirinhos);
        }

        System.out.println("Zézinho dormiu!");
    }
    
}
