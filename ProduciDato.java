/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es_semafori2;

/**
 *
 * @author Cesare
 */
class ProduciDato extends Thread {
    Semaforo pieno;
    Semaforo vuoto;
    int elementi=5;
    final int attesa=500;
    
    
    public ProduciDato(Semaforo s1,Semaforo s2, boolean esecuzione){
        pieno=s1;
        vuoto=s2;
        esecuzione=true;
    }
    public void run(){
        for(int i=0;i<elementi;i++){
            vuoto.P();
            Es_semafori2.buffer=i;
            System.out.println("dato:"+i);
            pieno.V();
            try{
                Thread.sleep(attesa);}
            catch(Exception e){}
            }
        System.out.println("termine");
        }
    }
    
