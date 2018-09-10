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
public class GrupoParqueaderos {
    private Parqueadero[] parqueadero;
    public void GrupoParqueaderos(){
        this.parqueadero = new Parqueadero[4];
        for (int i = 0; i < 4; i++) {
            this.parqueadero[i]=null;
        }
    }

    public Parqueadero checkParqueadero(int i) {
        return parqueadero[i];
    }

    public void setParqueadero(Parqueadero parqueadero, int i) {
        this.parqueadero[i] = parqueadero;
    }
    public int Checkpark(int placa){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if(this.parqueadero[i].getCarros(j).getPlaca()==placa){
                return i;
                }
            }
        }
    return 0;
    }
        public int Checkspace(int placa){
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 6; j++) {
                if(this.parqueadero[i].getCarros(j).getPlaca()==placa){
                return j;
                }
            }
        }
    return 0;
    }
    public int mejorParq(){
    int j =1;

        return j;
    }
    public int espaciolibre(int parq){
        int a=0;
        for (int i = 0; i < 5; i++) {
            if (parqueadero[parq].getCarros(i).getPlaca()==0) {
                
            }else{a++;}
        }
    
        return a;
    }
    public void registrarCarro(Carro carro, int parq, int space){
    parqueadero[parq].setCarros(carro, space); 
    }
}
