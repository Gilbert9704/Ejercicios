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

public class Carro extends Vehiculos {
    private int cantAutos = 0;
    HashMap <Integer, Carro> carros = new HashMap <>();
    
    //Inicia Constructor
    public Carro(String marca, String modelo, short año, short velocidadMax, int numeroSerie, boolean vendido) {
        super(marca, modelo, año, velocidadMax, numeroSerie, vendido);
    }
    //Finaliza Constructor

    public void ingresarCarro(String marca, String modelo, short año, short velocidadMax, int numeroSerie, boolean vendido){
        Scanner numAut = new Scanner(System.in);
        Scanner car = new Scanner(System.in);
        Scanner model = new Scanner(System.in);
        Scanner year = new Scanner(System.in);
        Scanner velocity = new Scanner(System.in);
        Scanner serie = new Scanner(System.in);
        
            System.out.println("¿Cuantos Carros va a ingresar?");
            cantAutos = numAut.nextInt();
             
                for (int i = cantAutos ; i > 0; i--){
                //Obtiene la marca
                    System.out.println("Ingrese la marca del Carro");
                    marca = car.nextLine();
                    setMarca(marca);
                //Obtiene el modelo
                    System.out.println("Ingrese el modelo del Carro");
                    modelo = model.nextLine();
                    setModelo(modelo);
                //Obtiene la velocidad Maxima
                    System.out.println("Ingrese la velocidad Maxima del Carro (km/h)");
                    velocidadMax = velocity.nextShort();
                    setVelocidadMax(velocidadMax);
                //Obtiene el Año
                    System.out.println("Ingrese el año del Carro");
                    año = year.nextShort();
                    setAño(año);
                //Obtiene el numero de Serie
                    System.out.println("Ingrese el numero de serie del carro");
                    numeroSerie = serie.nextInt();
                    setNumeroSerie(numeroSerie);
                    System.out.println();
                //El carro se declara como disponible, siempre que se crea
                    vendido = false;
                    
                //El condicional Verifica si ya existe el numero de serie ingresado.
                    if (carros.containsKey(numeroSerie)){
                        System.out.println("El numero de serie del carro ya existe, Rectifique e intente de nuevo");
                    }
                    else{ 
                    carros.put(numeroSerie, new Carro(marca, modelo, año, velocidadMax, numeroSerie, vendido));
                    }
                }
    }
    
    public void comprobarListado(){
        int contador = 0;
        byte decidirLista = 0;
        Scanner lista = new Scanner(System.in);
            
        System.out.println("¿Que lista desea ver? \n (1)Carros Disponibles \n (2)Carros Vendidos");
        decidirLista = lista.nextByte();
                      
        switch (decidirLista) {
            case 1:
                contador = 0;
                System.out.println("CARROS DISPONIBLES");
                for (Carro automovil : carros.values()){
                    if (automovil.isVendido() == false){
                        System.out.println();
                        System.out.println("Marca del Carro: " + automovil.getMarca());
                        System.out.println("Modelo: " + automovil.getModelo());
                        System.out.println("Velocidad Maxima (km/h): " + automovil.getVelocidadMax());
                        System.out.println("Año: " + automovil.getAño());
                        System.out.println("Numero de Serie: " + automovil.getNumeroSerie());
                        contador += 1;
                    }
                }
                System.out.println("Total Carros Disponibles: " + contador);
                break;
                
            case 2:
                contador = 0;
                System.out.println("CARROS VENDIDOS");
                for (Carro automovil : carros.values()){
                    if(automovil.isVendido() == true){
                        System.out.println();
                        System.out.println("Marca del Carro: " + automovil.getMarca());
                        System.out.println("Modelo: " + automovil.getModelo());
                        System.out.println("Velocidad Maxima (km/h): " + automovil.getVelocidadMax());
                        System.out.println("Año: " + automovil.getAño());
                        System.out.println("Numero de Serie: " + automovil.getNumeroSerie());
                        contador += 1;
                    }
                }
                System.out.println("Total Carros Vendidos: " + contador);
                break;
                
            default:
                System.out.println("No se Encontraron Autos");
                break;
        }
    }
    
    public void buscarCarro(){
        Scanner busqueda = new Scanner(System.in);
        int serieBuscar = 0;
        
        System.out.println("Ingrese el numero de serie del Carro a buscar");
        serieBuscar = busqueda.nextInt();
        
        Carro busquedaCarro = carros.get(serieBuscar);
        
        if (busquedaCarro != null){
            System.out.println("Marca: " + busquedaCarro.getMarca());
            System.out.println("Modelo: " + busquedaCarro.getModelo());
            System.out.println("Velocidad Maxima (km/h): " + busquedaCarro.getVelocidadMax());
            System.out.println("Año: " + busquedaCarro.getAño());
            System.out.println("Numero de Serie: " + busquedaCarro.getNumeroSerie());
            if (busquedaCarro.isVendido() == false){
                System.out.println("Estado: Disponible");
            }else{
                System.out.println("Estado: Vendido ");
            }
        }
        else{ 
            System.out.println("Serial invalido: " + serieBuscar);
        }
    }
    
    public void venderCarro(boolean vendido){
        int autoDisponible = 0;
        byte venderCarro_1 = 0;
        Scanner buscarDisponible = new Scanner(System.in);
        Scanner carroVendido = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de Serie del Carro a vender");
        autoDisponible = buscarDisponible.nextInt();
        
        Carro disponible = carros.get(autoDisponible);
        
        if (disponible != null && disponible.isVendido() == false){
            System.out.println("Marca: " + disponible.getMarca());
            System.out.println("Modelo: " + disponible.getModelo());
            System.out.println("Velocidad Maxima (km/h): " + disponible.getVelocidadMax());
            System.out.println("Año: " + disponible.getAño());
            System.out.println("Numero de Serie: " + disponible.getNumeroSerie());
            
            System.out.println("\n ¿Vender Auto? SI(1)/NO(0)");
            venderCarro_1 = carroVendido.nextByte();
            if(venderCarro_1 == 1){
                vendido = true;
                disponible.setVendido(vendido);
            }
        }
        else{
            System.out.println("Serial invalido: " + autoDisponible);
        }
    }
    
}
