/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo7;

/**
 *
 * @author equipo D
 */
public class Ballena extends Acuatico{
    private int largo;
    

    public Ballena() {
    }

    public Ballena(int largo, int numAletas, String nombre, String lugarOrigen, String color) {
        super(numAletas, nombre, lugarOrigen, color);
        this.largo = largo;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Ballena{"+super.toString() + "largo=" + largo + '}';
    }
    
    //funciones
    public void pelearConPinocho(){
        System.out.println("Gano pinocho");
    }
    
    
}
