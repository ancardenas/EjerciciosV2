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
        public int parqueaderos[][]=new int[4][5];
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field_1.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 1, Direction.SOUTH,10);
           /* 
	    //Mover una interseccion en el sentido al cual este apuntando el objeto.
            estudiante.move ();
            
            //Girar a la izquierda
            estudiante.turnLeft();
            
            //Tomando decisiones, Si puedo tomar un Thing
            boolean puedeTomar = estudiante.canPickThing();
            
            //Tomar un Thing
            if(puedeTomar == true)
               estudiante.pickThing();
            
            //Especifica el numero de Thing que tiene en robot en el bolso
            int numeroThings = estudiante.countThingsInBackpack();
            
            //Poner Thing, se debe validar que tenga things en el bolso
            estudiante.putThing();
                       
            //Si el frente esta libre de Wall
            estudiante.frontIsClear();
            
            //Invocando una funcion
            creacionFuncion(4);
            
            //Toman un Thing
            estudiante.pickThing();*/
           
 
            estudiante.move();
            int Coins= CheckTake(0);
            
            
           
	}
        
        public static int CheckTake(int Coin){
            while (estudiante.canPickThing()) {
            estudiante.pickThing();
            Coin = Coin + 1;
                
            }return Coin;}
        public static void MovePut(int Coin){
            estudiante.turnLeft();
            int dev=Coin;
            while (Coin!=0) {                
                estudiante.putThing();
                estudiante.move();
            }
            estudiante.turnLeft();
            estudiante.turnLeft();
            for (int i = 0; i < dev; i++) {
                
            }
        }
        
}

