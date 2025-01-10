package java_curso;

// public -> todos podem acessar
// default -> quando eu não defino, sempre segue esse
// private -> só a própria classe
// protected -> acessivel por todos que está no mesmo pacote

public class Main {

    public static void main(String[] args) {
        Carro meuCarro = new Sandero();
        Carro meuOutroCarro = new Mobi();

        SerVivo serVivo = new Humano();
        serVivo.respirar();

        Carro meuCarroFurado = null;

        try {
            meuCarroFurado.acelerar();
        } catch (NullPointerException exception) {
            System.out.println("Vendo carro furado");
        }

    }

}