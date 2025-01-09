package java_curso;

// public -> todos podem acessar
// default -> quando eu não defino, sempre segue esse
// private -> só a própria classe
// protected -> acessivel por todos que está no mesmo pacote

public class Main {

    public static void main(String[] args) {
        Carro meuCarro = new Carro("Gol");
        Carro outroCarro = new Carro("Fusca");
        Carro carroDoMeuVizinho = new Carro("Celta");

        meuCarro.acelerar();
        outroCarro.acelerar();
        carroDoMeuVizinho.acelerar();
    }

}