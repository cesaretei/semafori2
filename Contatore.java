/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es_semafori;
/**
 *
 * @author Cesare
 */
public class Contatore {
    int valore;
    int passo;
    
    public Contatore(int valore,int passo){
        this.valore=valore;
        this.passo=passo;
        
        System.out.println("contatore:"+this.getValore());
        
    }

    public int getValore() {
        return valore;
    }


    public int getPasso() {
        return passo;
    }

  public void incremento(){
      valore=valore+passo;
  }
  public void decremento(){
      valore=valore-passo;
  }
}
