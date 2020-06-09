package OOP_tests;

public class Pantalla implements Salida {
    
    public void write(final Dato data) {
        System.out.println("Se ha escrito " + data.getData() + " en la pantalla");
    }
}