package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class EJERCICIO1
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        public static int dir;
	 
        public static void faceNorth(){
            if (dir==4) {
                estudiante.turnLeft();
                estudiante.turnLeft();
                estudiante.turnLeft();
            }
            if (dir==3) {
                estudiante.turnLeft();
                estudiante.turnLeft();
            }
            if (dir==2) {
                estudiante.turnLeft();
            }dir=1;
            
        }
        public static void faceEast(){
            if (dir==1) {
                estudiante.turnLeft();
                estudiante.turnLeft();
                estudiante.turnLeft();
            }
            if (dir==4) {
                estudiante.turnLeft();
                estudiante.turnLeft();
            }
            if (dir==3) {
                estudiante.turnLeft();
            }dir=2;
            
        }
        public static void faceSouth(){
            if (dir==2) {
                estudiante.turnLeft();
                estudiante.turnLeft();
                estudiante.turnLeft();
            }
            if (dir==1) {
                estudiante.turnLeft();
                estudiante.turnLeft();
            }
            if (dir==4) {
                estudiante.turnLeft();
            }dir=3;
            
        }
        public static void faceWest(){
            if (dir==3) {
                estudiante.turnLeft();
                estudiante.turnLeft();
                estudiante.turnLeft();
            }
            if (dir==2) {
                estudiante.turnLeft();
                estudiante.turnLeft();
            }
            if (dir==1) {
                estudiante.turnLeft();
            }dir=4;
            
        }
        public static void toSpace(int parq,int space){
            if (parq==1) {
                switch (estudiante.getAvenue()){
                    case 4: faceWest(); estudiante.move();
                                        estudiante.move();
                                        estudiante.move();break;
                    case 7: faceWest(); for (int i = 0; i < 6; i++) {
                            estudiante.move();
                        }break;
                }


            }
            if (parq==2) {
                switch (estudiante.getAvenue()) {
                    case 1: faceEast(); estudiante.move();
                                        estudiante.move();
                                        estudiante.move();break;
                    case 7: faceWest(); estudiante.move();
                                        estudiante.move();
                                        estudiante.move();break;
                }
            }
            if (parq==3) {
                switch (estudiante.getAvenue()){
                    case 1: faceEast(); for (int i = 0; i < 6; i++) {
                            estudiante.move();
                        }break;
                    case 4: faceEast(); estudiante.move();
                                        estudiante.move();
                                        estudiante.move();break;
                }
            }
            faceNorth();
            for (int i = 0; i < space; i++) {
                estudiante.move();
            }faceEast();estudiante.move();
        }
        public static void parking(Carro carro, int parq, int space){
            

            toSpace(parq,space);
            estudiante.putThing();
        }
        public static void main (String[] args){
        
            GrupoParqueaderos grupoParqueaderos =new GrupoParqueaderos();
           dir=1;
//Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            //Avenue Vertical Street Horizontal
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,6, 1, Direction.NORTH,10);
            Carro parqueo = new Carro(233, 0);
            int parq= grupoParqueaderos.mejorParq();
            int space = grupoParqueaderos.espaciolibre(parq);
            parking(parqueo, parq,space);

            
        }
        
}

