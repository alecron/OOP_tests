package OOP_tests;

public class Registro extends Entrada implements Salida{
    
    public Registro(){};

    public Registro(final long value) {
        data = new Dato(value);
    };

    public void write(final Dato _data) {
        data = _data;
    }
}