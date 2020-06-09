package OOP_tests;

public class Dato {
   long data;

   public Dato(final long _data) {
       data = _data;
   }

   public long getData(){
       return data;
   }

   public void inc(){
       ++data;
   }
}