/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo7;

/**
 *
 * @author equipo D
 */
public class Aereo extends Animal{
    private int alas;
    

    
    public Aereo() {
    }

    public Aereo(int alas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.alas = alas;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    @Override
    public String toString() {
        return "Aereo{"+super.toString() + "alas=" + alas + '}';
    }
    
    //funciones
    public void volar(){
        System.out.println("Corriedo");
    }
    public void comer(){
        System.out.println("Comiendo insectos");
    }
}
