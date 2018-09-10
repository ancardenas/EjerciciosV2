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
public class Carro {
    private int placa;
    private int tiempo;

    public Carro(int placa, int tiempo) {
        this.placa = placa;
        this.tiempo = tiempo;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getPlaca() {
        return placa;
    }

    public int getTiempo() {
        return tiempo;
    }

    
    
}
