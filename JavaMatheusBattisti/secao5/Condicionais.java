package secao5;

public class Condicionais {

    public static void main(String[] args) {
        // Operadores de comparação
        // ==, !=, >, <, >=, <=

        int x = 10;

        System.out.println(x == 10);
        System.out.println(x == 9);
        System.out.println(x != 5);
        System.out.println(x != 10);
        System.out.println(x > 10);
        System.out.println(x >= 10);
        System.out.println(x < 10);
        System.out.println(x <= 10);

        // "palavra" == "palavra" -> Utilizando == para comparar strings não é
        // "palavra".equals("palavra") -> Utilize o método equals para comparar strings
        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1 == str2); // false

        System.out.println(str1.equals(str2)); // true

        // if
        int numero = 10;

        if (numero > 5) {
            System.out.println("O número é maior que 5");
        }

        // else
        int q = 7;
        if (q > 10) {
            System.out.println("Q é maior que 10");
        } else {
            System.out.println("Q é menor ou igual a 10");
        }

        // else if
        double nota = 8.5;

        if (nota >= 9) {
            System.out.println("Nota muito boa");
        } else if (nota >= 7) {
            System.out.println("Acima da média");
        } else {
            System.out.println("Nota abaixo da média");
        } 
    }
}
