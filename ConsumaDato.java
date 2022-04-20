/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es_semafori2;

/**
 *
 * @author Cesare
 */
class ConsumaDato extends Thread {
   Semaforo pieno;
   Semaforo vuoto;
   
   int dato;
   public ConsumaDato(Semaforo s1,Semaforo s2, boolean esecuzione){
       pieno=s1;
       vuoto=s2;
       esecuzione=false;
   }
   public void run(){
       while(true){
           pieno.P();
           dato=Es_semafori2.buffer;
           System.out.println("dato:"+dato);
           vuoto.V();
       }
   }

  
   
  
}
