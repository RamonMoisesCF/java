package secao2;

public class Exercicios {

    public static void main(String[] args) {

        int numero = 10;
        int numero2 = numero * 2;
        System.out.println(numero2);

        char letra = 'B';
        int valorAscii = (int) letra;
        System.out.println(valorAscii);

        double n1 = 15.75;
        double n2 = 20.40;
        double soma = n1 + n2;
        System.out.println(soma);

        long numeroGrande = 2_000_000_000L;
        int castExplicito = (int) numeroGrande;
        System.out.println(castExplicito);

        String palavra = "Olá, Mundo!";
        String frase = palavra + " Bem-vindo ao Java!";
        System.out.println(frase);
    }
}
