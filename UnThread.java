/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es_semafori;

/**
 *
 * @author Cesare
 */
public class UnThread extends Thread {
    
    private int inizia=0;
    private int delta=1;
    private String nome="";
    Contatore conta;
    
    
    public UnThread(String nomeThread,Contatore conta){
        this.nome=nomeThread;
        this.conta=conta;
    }
    public void run(){
        //ciclo che si ripete 
        for(;;){
           
           inizia=inizia+delta;
           Es_semafori.x++;//modifica  le varibili della classe
           conta.incrementa();
           try{ Thread.sleep(1500);}
           catch(InterruptedException e){
               System.out.println(e);}
           if(inizia>5)//termina dopo 5 volte
               return;
           }
        }
    }

