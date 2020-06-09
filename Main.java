package Examen_18_19;

public class Main{
    public static void main(String args[]){
        Teclado kBoard = new Teclado(1234);
        Pantalla scr = new Pantalla();
        Maquina mach = new Maquina();
        for(int i = 0 ; i<10 ; i++){
            mach.anyadirReg(new Registro(3*i));
        }

        mach.stat();

        mach.mov(kBoard, mach.getReg(2));

        mach.stat();

        mach.mov(mach.getReg(5), scr);
    }
}