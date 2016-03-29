/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.*;

/**
 *<h1>Algoritmo Concesionario</h1>
 * Algoritmo que me permite realizar un registro y gestionar la informacion
 * sobre los carros de un concesionario.
 * 
 * @author Gilbert Angulo Saucedo
 * @version 2.0
 * @since 12/03/2016 (DD/MM/AA)
 * 
 */

public class Concesionario {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        String marcaVeh = null;
        String modeloVeh = null;
        byte comandoPrinc = 0;
        byte comando = 0;
        short velMax = 0;
        short añoVeh = 0;
        int numSerieVeh = 0;
        boolean venderVeh = false;
        
        Carro c = new Carro(marcaVeh, modeloVeh, añoVeh, velMax, numSerieVeh, venderVeh);
        Moto m = new Moto(marcaVeh, modeloVeh, añoVeh, velMax, numSerieVeh, venderVeh);
        
        Scanner accionPrinc = new Scanner(System.in);
        Scanner accion = new Scanner(System.in);
        
        do{
            System.out.println("CONCESIONARIO \n ¿Con qué tipo de vehículo va a tratar? \n (1)Carro \n (2)Moto");
            comandoPrinc = accionPrinc.nextByte();
            
            if (comandoPrinc == 1){
                
                System.out.println(" CONCESIONARIO \n ¿Que desea Realizar? \n (1)Ingresar Carros \n (2)Mostrar Listado de Carros \n (3)Buscar Carro \n (4)Vender Carro \n (5)Regresar al Menú Principal");
                comando = accion.nextByte();
                
                switch (comando) {
                    case 1:
                        c.ingresarCarro(marcaVeh, modeloVeh, añoVeh, velMax, numSerieVeh, venderVeh);
                        break;
                
                    case 2:
                        c.comprobarListado();
                        break;
                    
                    case 3:
                        c.buscarCarro();
                        break;
                
                    case 4:
                        c.venderCarro(venderVeh);
                        break;
                
                    case 5:
                        //Regreso al menu principal
                        break;
                
                    default:         
                        break;
                }      
            }
            else if (comandoPrinc == 2){
                System.out.println(" CONCESIONARIO \n ¿Que desea Realizar? \n (1)Ingresar Motocicletas \n (2)Mostrar Listado de Motocicletas \n (3)Buscar Motocicleta \n (4)Vender Motocicleta \n (5)Regresar al Menú Principal");
                comando = accion.nextByte();
                
                switch (comando) {
                    case 1:
                        m.ingresarMoto(marcaVeh, modeloVeh, añoVeh, velMax, numSerieVeh, venderVeh);
                        break;
                    
                    case 2:
                        m.comprobarListado();
                        break;
                        
                    case 3:
                        m.buscarMoto();
                        break;
                        
                    case 4:
                        m.venderMoto(venderVeh);
                        break;
                        
                    case 5:
                        //Regreso al menu principal
                        break;
                        
                    default:
                        break;
                }  
            } 
        }while (comandoPrinc <= 2);   
    }
    
}
    

