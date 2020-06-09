package Examen_18_19;

public class Dato {
   long data;

   public Dato(long _data){
       data = _data;
   }

   public long getData(){
       return data;
   }

   public void inc(){
       ++data;
   }
}