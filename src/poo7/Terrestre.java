/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo7;

/**
 *
 * @author javierluna
 */
public class Terrestre extends Animal{
    private int patas;
    

    public Terrestre() {
    }

    public Terrestre(int patas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.patas = patas;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    @Override
    public String toString() {
        return "Terrestre{"+super.toString() + "patas=" + patas + '}';
    }
    
    //funciones
    public void correr(){
        System.out.println("Corriedo");
    }
    public void comer(){
        System.out.println("Comiendo carne o hierba");
    }
}
