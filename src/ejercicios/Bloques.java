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
public class Bloques {
    //Bloques
    public static void main(String[] args){
        int x = 0;
        int y = 0;
        while (x < 5) {
            x = ++x;
            y = y + x;
            System.out.print(x + "" + y + ""); 
        }
    }
}
