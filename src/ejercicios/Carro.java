/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author User
 */
public class Carro {
    
    double altura;
    double peso;
    short velocidadMax;
    short año;
    String modelo;
    String marca;
    boolean vendido = false;
    
    //Inicia Constructor
    public Carro(){
        altura = 1.60;
        peso = 1.2;
        velocidadMax = 260;
        modelo = "Mustang" ;
        marca = "Ford";
        año = 2016;
    }

    public Carro(double altura, double peso, short velocidadMax, short año, String modelo, String marca) {
        this.altura = altura;
        this.peso = peso;
        this.velocidadMax = velocidadMax;
        this.año = año;
        this.modelo = modelo;
        this.marca = marca;
    }
    //Finaliza Constructor
    
    public void mostrarDatos(){
        System.out.println("Datos del Carro: \n Marca: " + marca + "\n Modelo: " + modelo + "\n Año: " + año);
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
