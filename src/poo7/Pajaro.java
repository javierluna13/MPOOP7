/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo7;

/**
 *
 * @author equipo D
 */
public class Pajaro extends Aereo{
    private String pico;
    
    
    public Pajaro() {
    }

    public Pajaro(String pico, int alas, String nombre, String lugarOrigen, String color) {
        super(alas, nombre, lugarOrigen, color);
        this.pico = pico;
    }

    public String getPico() {
        return pico;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    @Override
    public String toString() {
        return "Pajaro{"+super.toString() + "pico=" + pico + '}';
    }
    
    //funciones
    public void recolectarRamas(){
        System.out.println("Para nido recolecto las ramas");
    }
}
