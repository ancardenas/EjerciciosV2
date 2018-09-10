/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

/**
 *
 * @author Andres
 */
public class Parqueadero {
    private Carro[] carros;

    public Parqueadero() {
        this.carros = new Carro[5];
        for (int i = 0; i < 5; i++) {
            this.carros[i]=null;
        }
    }

    public Carro getCarros(int i) {
        return carros[i];
    }

    public void setCarros(Carro carro, int i) {
        this.carros[i]=carro;
    }
    public int espacioLibre(){
        int a = 1;
        for (int i = 0; i < 5; i++) {
            if (this.carros[i]!=null){
                a=a+1; } else {
                
            }
        }
    return a;}
    
    
    
}
