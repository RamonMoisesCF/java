package java_curso;

public class Sandero implements Carro {

    @Override
    public void acelerar() {
        System.out.println("Acelerando o Sandero");
    }

    @Override
    public void frear() {
        System.out.println("Freando o Sandero");
    }

    @Override
    public void parar() {
        System.out.println("Parando o Sandero");
    }
}
