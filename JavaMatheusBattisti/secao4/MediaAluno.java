package secao4;

import java.util.Scanner;

public class MediaAluno {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o nome do aluno: ");
            String nome = scanner.nextLine();

            System.out.println("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();

            System.out.println("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();

            System.out.println("Digite a terceira nota: ");
            double nota3 = scanner.nextDouble();

            double media = (nota1 + nota2 + nota3) / 3;

            System.out.println("A média do aluno " + nome + " é: " + media);

            String situacao = (media >= 7) ? "aprovado!" : "reprovado!";
            System.out.println("Aluno " + situacao);
        }
    }
}
