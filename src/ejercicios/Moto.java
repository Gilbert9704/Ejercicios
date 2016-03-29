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

public class Moto extends Vehiculos{
    private int cantMotos = 0;
    HashMap <Integer, Moto> motos = new HashMap<>();
    
    //Inicia Constructor
    public Moto(String marca, String modelo, short año, short velocidadMax, int numeroSerie, boolean vendido) {
        super(marca, modelo, año, velocidadMax, numeroSerie, vendido);
    }
    //Finaliza Constructor
    
    public void ingresarMoto(String marca, String modelo, short año, short velocidadMax, int numeroSerie, boolean vendido){
        Scanner numMot = new Scanner(System.in);
        Scanner motorc = new Scanner(System.in);
        Scanner model = new Scanner(System.in);
        Scanner year = new Scanner(System.in);
        Scanner velocity = new Scanner(System.in);
        Scanner serie = new Scanner(System.in);
        
            System.out.println("¿Cuantas Motocicletas va a ingresar?");
            cantMotos = numMot.nextInt();
            
            
                for (int i = cantMotos ; i > 0; i--){
                //Obtiene la marca
                    System.out.println("Ingrese la marca de la Motocicleta");
                    marca = motorc.nextLine();
                    setMarca(marca);
                //Obtiene el modelo
                    System.out.println("Ingrese el modelo de la Motocicleta");
                    modelo = model.nextLine();
                    setModelo(modelo);
                //Obtiene la velocidad Maxima
                    System.out.println("Ingrese la velocidad Maxima de la Motocicleta (km/h)");
                    velocidadMax = velocity.nextShort();
                    setVelocidadMax(velocidadMax);
                //Obtiene el Año
                    System.out.println("Ingrese el año de la Motocicleta");
                    año = year.nextShort();
                    setAño(año);
                //Obtiene el numero de Serie
                    System.out.println("Ingrese el numero de serie de la Motocicleta");
                    numeroSerie = serie.nextInt();
                    setNumeroSerie(numeroSerie);
                    System.out.println();
                //La motocicleta se declara como disponible, siempre que se crea
                    vendido = false;
                    
                //El condicional Verifica si ya existe el numero de serie ingresado.
                    if (motos.containsKey(numeroSerie)){
                        System.out.println("El numero de serie de la motocicleta ya existe, Rectifique e intente de nuevo");
                    }
                    else{ 
                    motos.put(numeroSerie, new Moto(marca, modelo, año, velocidadMax, numeroSerie, vendido));
                    }
                }
    }
    
    public void comprobarListado(){
        
    }
    
    public void buscarMoto(){
        
    }
    
    public void venderMoto(boolean vendido){
        
    }
    
}
