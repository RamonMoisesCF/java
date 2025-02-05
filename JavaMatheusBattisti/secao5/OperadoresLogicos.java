package secao5;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // AND
        int idade = 18;
        boolean temCarteiraDeMotorista = true;

        // true == true -> true
        System.out.println(idade >= 18 && temCarteiraDeMotorista);
        System.out.println(idade >= 18 && temCarteiraDeMotorista == true);

        boolean carteiraVencida = true;

        System.err.println(idade >= 18 && temCarteiraDeMotorista && carteiraVencida == false);
    }
}
