/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios; 
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

public class Vehiculos {

    protected short velocidadMax;
    protected short año;
    protected int numeroSerie = 0;
    protected String modelo;
    protected String marca;
    protected boolean vendido = false;

    public Vehiculos(String marca, String modelo, short año, short velocidadMax, int numeroSerie, boolean vendido) {
        this.año = año;
        this.modelo = modelo;
        this.marca = marca;
        this.velocidadMax = velocidadMax;
        this.numeroSerie = numeroSerie;
        this.vendido = vendido;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public short getAño() {
        return año;
    }

    public void setAño(short año) {
        this.año = año;
    }

    public short getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(short velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
    
    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    
    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }
    
}
