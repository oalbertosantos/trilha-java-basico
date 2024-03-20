package edu.alberto.terceirasemana;

/* ESTRUTURAS EXCEPCIONAIS

 Exceções: ao executar um código Java, diferentes tipos de erros podem acontecer. Quando ocorre um erro, o Java normalmente para e aparece uma mensagem de erro. O termo técnico para isso é: Java lançará uma exceção.

 Erro: algo irreparável, a aplicação trava ou é encerrada drasticamente.
 Exceção: fluxo inesperado da nossa aplicação, nmão previstos pela aplicação.
 Tratamento de exceções: responsabilidade do desenvolvedor.

 Try: permite que seja definido um bloco de código para ser testado, quanto a erros, quando executado.
 Catch: permite que seja definido um bloco de código a ser executado, quando tem erro no bloco TRY.
 Finally: permite que seja definido um bloco de código a ser executado, independente de ocorrer erro ou não. TRY e CATCH vem em pares. */

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
        // criando o objeto scanner:
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        Double altura = scanner.nextDouble();

        // imprimindo os dados obtidos pelo usuário:
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " ");
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close(); 
        }
        catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numericos");  
        }
    }
}
