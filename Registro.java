package Examen_18_19;

public class Registro extends Entrada implements Salida{
    
    public Registro(){};

    public Registro(long value){
        data = new Dato(value);
    };

    public void write(Dato _data){
        data = _data;
    }
}