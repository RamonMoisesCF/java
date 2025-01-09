package java_curso;

public class Carro {

    String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println("Acelerando o carro " + this.modelo);
    }
}

class Rodas {
    public Rodas() {
        Carro carro = new Carro("teste");
        carro.acelerar();
    }
}
