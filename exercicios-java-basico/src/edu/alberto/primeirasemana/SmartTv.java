/* Vamos criar um exemplo de uma classe para representar uma smartTv, critérios: 
 1) Ligada (boolean), canal (int), volume (int);
 2) Poderá ligar e desligar e assim mudar o estado ligada;
 3) Aumentará e diminuirá o volume em +1 ou -1;
 4) Poderá mudar de canal de 1 em 1 ou definindo o número correspondente.
 */

package edu.alberto.primeirasemana;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;

    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    
}
