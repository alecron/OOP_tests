package Examen_18_19;

import java.util.ArrayList;

public class Maquina {
    ArrayList<Registro> regBench = new ArrayList<Registro>();

    public Maquina(){}

    public void anyadirReg(Registro reg){
        regBench.add(reg);
    }

    public long readReg(int num){
        return ((regBench.get(num)).read()).getData();
    }

    public void stat(){
        for(int i = 0 ; i < regBench.size() - 1 ; i++){
            System.out.println("Reg " + i + " contains " + readReg(i));
        }
    }

    public Registro getReg(int i){
        return regBench.get(i);
    }
    //mueve un dato desde la entrada %a hasta la salida %b
    public void mov(Entrada a, Salida b){
        b.write(a.read());
    }
    
    //incrementa en uno el valor de %a (que debe ser de entrada y de salida)
    public void inc(Dato a){
        a.inc();
    }
}