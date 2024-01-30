package edu.alberto.primeirasemana;

/* Uma classe é definida por atrubutos e métodos. Atributos: em sua maioris, são variáveis de diferentes tipos e valores. métodos: por sua vez, correspondem a funções ou sub-rotinas disponíveis dentro de nossas classes.

Criterio de nomeação de métodos (não são obrigatorios, mas é recomendável que sejam inseridos, pois essas convenções faciltam a vida de programadore ao trabalharem em códigos de forma colaborativa.) os critérios são: deve ser nomeado como verbo, seguir o padrão "camelCase".

Ex.: somar (int n1, int n2) {}, abrirConecao(){}.

Em java não existe o conceito de métodos "globais", todos devem ser SEMPRE difinidos dentro de uma classe.

Critérios de definição de métodos: Qual a proposta principal do método? Você deve se perguntar isso. Qual o tipo de retorno esperado ao executar o método? Você deve analisar se o método será responsável por retornar algum valor ou não. Quais pârametros serão necessários para a execução do método? O método possui o risco de apresentar alguma exceção? Qual a visibilidade do método? Esses são alguns critérios.

Ex.: */

public class Metodos {
    public double somar (int num1, int num2) { //dentro da classe metodos, tem um método que retorna um "double" e que é publico, ou seja, está visivel por todo o systema, tem a finalidade de somar, mas precisa de dois parametros inteiros "int num1, int num2". Quando temos um método que nos retorna alguma coisa, é preciso finalizar com "return".

        //Lógica - finalidade do método
        return ... ; 

    }
}
