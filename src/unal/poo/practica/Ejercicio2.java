package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Ejercicio2
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        public static void move(int a){
            for(int i=0;i<a;i++){
                estudiante.move ();
            }
        }
        public static void ej1(int a){
            for(int i=0;i<a;i++){
                move(3);
                estudiante.turnLeft();
            }
        }
        public static void ej2(){
            for(int i=0;i<1;i++){
                estudiante.move();
                estudiante.turnLeft();
                estudiante.move();
                estudiante.turnLeft();
                estudiante.move();
            }
        }
        public static void turnRight(){
            for(int i=0;i<3;i++){
                estudiante.turnLeft();
            }
        }
        
                         
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,1, 2, Direction.SOUTH,10);
            
	    //Mover una interseccion en el sentido al cual este apuntando el objeto.
            /*if(estudiante.frontIsClear()){
                move(1);
            }else{
                estudiante.turnLeft();
            };
            move(2);
            estudiante.turnLeft();
            ej1(3);
            move(1);*/
            turnRight();
            ej2();
            boolean puedeTomar = estudiante.canPickThing();
            if(puedeTomar == true)
               estudiante.pickThing();
            
            /*
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
            estudiante.pickThing();
            
            */
	}
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }
}

