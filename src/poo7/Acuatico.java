/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo7;

/**
 *
 * @author equipo D
 */
public class Acuatico extends Animal{
    private int numAletas;


    public Acuatico() {
    }

    public Acuatico(int numAletas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numAletas = numAletas;
    }

    public int getNumAletas() {
        return numAletas;
    }

    public void setNumAletas(int numAletas) {
        this.numAletas = numAletas;
    }

    @Override
    public String toString() {
        return "Acuatico{"+super.toString() + "numAletas=" + numAletas + '}';
    }
    
    //funciones
    public void nadar(){
        System.out.println("Nadando");
    }
    public void comer(){
        System.out.println("Comiendo peces");
    }
    
}
