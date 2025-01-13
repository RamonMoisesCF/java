package secao2;

public class Variavel {

    public static void main(String[] args) {

        String nome = "Ramon";

        System.out.println("Olá, " + nome + "!");

        String nome2 = nome;

        System.out.println("Olá, " + nome2 + "!");

        // Tipos primitivos:
        // byte = -128 até 127 ocupa 8 bits
        // short = -32.768 até 32.767 ocupa 16 bits
        // int = -2.147.483.648 até 2.147.483.647 ocupa 32 bits
        // long = -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807 ocupa 64 bits
        // float = 1.4E-45 ate 3.4028235E38 ocupa 32 bits
        // double = 4.9E-324 ate 1.7976931348623157E308 ocupa 64 bits
        // boolean = true ou false ocupa 1 bit
        // char = '\u0000' a '\uffff' ocupa 16 bits

        long numeroGrande = 999999999999999999L;

        // int numeroGrande2 = numeroGrande;

        System.out.println(numeroGrande);

        // char
        // Apenas um caractere
        char letra = 'A';

        System.out.println(letra);

        // int
        // Números inteiros

        int numero = 10;

        System.out.println(numero);
        System.out.println(numero + 5);
        System.out.println(numero * 5);

        float a = 5;
        float b = 4;

        System.out.println("TESTANDO" + a / b);

        // long
        // Números inteiros maiores

        long numeroGrande2 = 999999999999999999L;
        long numeroGrandeMaisLegivel = 999_999_999_999_999_999L;

        System.out.println(numeroGrande2);
        System.out.println(numeroGrandeMaisLegivel);

        // double
        // Números reais

        double preco = 19.99;

        System.out.println(preco);
        System.out.println(preco - 10);
        System.out.println(preco / 10);

        double pi = 3.141_592_653_589_793;

        System.out.println(pi);
        double valorComD = 3.141592653589793D;
        System.out.println(valorComD);

        /**
         * Operadores Aritméticos
         * + Adição
         * - Subtração
         * * Multiplicação
         * / Divisão
         * % Resto
         */

        int soma = 10 + 5;
        System.out.println(soma);
        System.out.println(10 + 5);
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 5);

        /**
         * Para um retorno preciso de um calculo quebrado, como 10 / 3 que vai retronar
         * 3.3333...
         * é necessário que pelo menos uma das variáveis seja do tipo double ou escrito
         * já com ".0"
         */

        System.out.println(10 / 3); // resultado = 3
        System.out.println(10.0 / 3); // resultado = 3.3333333333333335
        System.out.println(10 / 3.0); // resultado = 3.3333333333333335
        System.out.println(10.0 / 3.0); // resultado = 3.3333333333333335
        // resto
        System.out.println(10 % 3); // resultado = 1

        // int a += 10; é o mesmo que a = a + 10;
        int x = 10;
        x += 5;
        System.out.println(x); // resultado = 15

        // constantes
        final int DIAS_DA_SEMANA = 7;
        System.out.println("Dias da semana: " + DIAS_DA_SEMANA);
    }
}
