package edu.alberto.terceirasemana;

/* Do While - assim como o while, determina que enquanto uma condição for válida, o bloco de código será executado. Entretanto, o do while testa a condição após executar o código, logo, mesmo que a condição seja considerada inválida no primeiro teste o bloco será executado pelo menos uma vez.

Ex.: Zézinho resolveu ligar para o seu colega dizendo que se intupiu de comer doces.
 */

 import java.util.Random;

 public class ExemploDoWhile {
     
     public static void main(String[] args) {
            System.out.println("Discando ...");
            do {
                //executando repetidas vezes até alguém atender
                System.out.println("Telefone tocando");

            } while (tocando());

            System.out.println("Aló!!!");
        }

     private static boolean tocando() {
         boolean atendeu = new Random().nextInt(3) == 1;
         System.out.println("Atendeu? " + atendeu);
         // negando o ato de continuar tocando
         return ! atendeu;
     }

}