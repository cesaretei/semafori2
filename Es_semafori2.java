/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es_semafori2;

/**
 *
 * @author Cesare
 */
public class Es_semafori2{
protected static int buffer;
 
    public static void main(String[] args) {
        
        boolean esecuzione=false;
       Semaforo pieno=new Semaforo(0);
       Semaforo vuoto=new Semaforo(1);
       ProduciDato prod=new ProduciDato(pieno, vuoto);
       ConsumaDato cons=new ConsumaDato(pieno,vuoto);
       prod.start();
       cons.start();
        System.out.println("termine del thread");
    }
    
}
