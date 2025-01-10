package java_curso;

public class Humano extends SerVivo {

    public Humano() {
        super(25);
    }

    @Override
    public void respirar() {
        System.out.println(this.idade);
        System.out.println("Respirando");
    }
}
