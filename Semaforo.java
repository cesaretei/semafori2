/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es_semafori;

/**
 *
 * @author Cesare
 */
public class Semaforo {
    int x;
    public Semaforo(int v){
        x=v;
    }
    synchronized public void P(){
        //rosso 
        while (x==0){
            //thread si interrompe
            try { wait();}
            catch(InterruptedException e){}
            }
       
            x--;
        }
    synchronized public void V(){
        //verde
        x++;
        //riparte il thread 
        notify();
    }
    
    }

