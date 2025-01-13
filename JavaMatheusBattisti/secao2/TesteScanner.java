package secao2;

import java.util.Scanner;

public class TesteScanner {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // O try fecha o scanner automaticamente ao final do bloco

            System.out.println("Digite o seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite a sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite o seu peso: ");
            double peso = scanner.nextDouble();

            System.out.println("Digite a sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Peso: " + peso);
            System.out.println("Altura: " + altura);

            // Problema do nextLine
            System.out.println("Digite um numero: ");
            int n = scanner.nextInt();

            System.out.println("Digite uma palavra: ");
            String palavra = scanner.nextLine();

            System.out.println("Numero: " + n);
            System.out.println("Palavra: " + palavra);
        }
    }
}
