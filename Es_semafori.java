/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es_semafori;

/**
 *
 * @author Cesare
 */
public class Es_semafori {
 protected static int x=100; 
    public static void main(String[] args) {
        
   Contatore conta=new Contatore(0,1);
   Thread thr1=new UnThread("pippo",conta);
   Thread thr2=new UnThread("pluto",conta);
   thr1.start();
   thr2.start();
   
    }
    
}
