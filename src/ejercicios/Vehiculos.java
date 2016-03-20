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
 * @version 1.0
 * @since 12/03/2016 (DD/MM/AA)
 * 
 */
public class Vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String marcaAuto = null;
        String modeloAuto = null;
        byte comando = 0;
        short velMax = 0;
        short añoAuto = 0;
        int numSerieAuto = 0;
        boolean venderAuto = false;
            
        Scanner accion = new Scanner(System.in);
        
        Carro c = new Carro(marcaAuto, modeloAuto, añoAuto, velMax, numSerieAuto, venderAuto);
        
        do{
            System.out.println(" CONCESIONARIO \n ¿Que desea Realizar? \n 1-Ingresar Autos \n 2-Mostrar Listado de Autos \n 3-Buscar Auto \n 4-Vender Auto");
            comando = accion.nextByte();
                switch (comando) {
                case 1:
                    c.ingresarCarro(marcaAuto, modeloAuto, añoAuto, velMax, numSerieAuto, venderAuto);
                break;
                
                case 2:
                    c.comprobarListado();
                break;
                    
                case 3:
                    c.buscarCarro();
                break;
                
                case 4:
                    c.venderCarro();
                break;
                
                default:
                
                break;
                }
        }while (comando <= 4);
        
    }
    
}
