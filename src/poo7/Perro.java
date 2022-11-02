/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo7;

/**
 *
 * @author equipo D
 */
public class Perro extends Terrestre{
    private String collar;


    public Perro() {
    }

    public Perro(String collar, int patas, String nombre, String lugarOrigen, String color) {
        super(patas, nombre, lugarOrigen, color);
        this.collar = collar;
    }

    public String getCollar() {
        return collar;
    }

    public void setCollar(String collar) {
        this.collar = collar;
    }

    @Override
    public String toString() {
        return "Perro{"+super.toString() + "collar=" + collar + '}';
    }
    
    //funciones
    public void hacerTrucos(){
        System.out.println("Dar la pata");
    }
}
