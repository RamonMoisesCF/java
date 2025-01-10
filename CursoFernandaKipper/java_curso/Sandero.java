package java_curso;

public class Sandero implements Carro {

    final int limiteDeVelocidade = 150;

    public int velocidadeAtual = 0;

    @Override
    public void acelerar() {
        if (this.velocidadeAtual < this.limiteDeVelocidade) {
            this.velocidadeAtual += 10;
            System.out.println("Acelerando o Sandero");
        }
        System.out.println("Valocidade atual do Sandero" + this.velocidadeAtual);
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
