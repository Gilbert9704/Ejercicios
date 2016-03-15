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
public class Carro {
    
    short velocidadMax;
    short año;
    int cantAutos = 0;
    int numeroSerie = 0;
    String modelo;
    String marca;
    boolean vendido = false;
    
    HashMap <Integer, Carro> carros = new HashMap <>();
    //Inicia Constructor

    public Carro(String marca, String modelo, short año, short velocidadMax, int numeroSerie) {
        this.año = año;
        this.modelo = modelo;
        this.marca = marca;
        this.velocidadMax = velocidadMax;
        this.numeroSerie = numeroSerie;
    }
    //Finaliza Constructor

    public short getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(short velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public short getAño() {
        return año;
    }

    public void setAño(short año) {
        this.año = año;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void ingresarCarro(String marca, String modelo, short año, short velocidadMax, int numeroSerie){
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
                    
                    if (carros.containsKey(numeroSerie)){
                        System.out.println("El numero de serie del carro ya existe, Rectifique e intente de nuevo");
                    }
                    else{ 
                    carros.put(numeroSerie, new Carro(marca, modelo, año, velocidadMax, numeroSerie));
                    }
                }
    }
    
    public void comprobarListado(){
            for (Carro automovil : carros.values()){
                    System.out.println();
                    System.out.println("Marca del Carro:");
                    System.out.println(automovil.getMarca());
                    System.out.println("Modelo:");
                    System.out.println(automovil.getModelo());
                    System.out.println("Velocidad Maxima (km/h):");
                    System.out.println(automovil.getVelocidadMax());
                    System.out.println("Año:");
                    System.out.println(automovil.getAño());
                    System.out.println("Numero de Serie:");
                    System.out.println(automovil.getNumeroSerie());
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
        }
        else{
            System.out.println("Serial invalido: " + serieBuscar);
        }
    }
    
    public void venderCarro(){
        vendido = true;
    }
    
    public void comprobarVenta(){
        if (vendido == true){
            System.out.println("El Carro ha sido Vendido");
        }else{
            System.out.println("El Carro se encuentra disponible");
        }
    }   
}
