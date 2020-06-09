package Examen_18_19;

public class Pantalla implements Salida {
    
    public void write(Dato data){
        System.out.println("Se ha escrito " + data.getData() + " en la pantalla");
    }
}