/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo7;

/**
 *
 * @author Equipo D
 */
public class POO7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //LABORATORIO.
        /*Gerente ger1= new Gerente();
        
        ger1.setNombre("Luis");
        ger1.setNumEmpleado(8532);
        ger1.setPresupuesto(50000);
        ger1.setSueldo(10);
        
        System.out.println(ger1);
        */
        
        // Actividad casa.
        //Equipo D.
        
        System.out.println("##############");
        System.out.println("### Ballena ###");
        System.out.println("##############");
        System.out.println(" ");
        
        //Ballena.
        Ballena ball=new Ballena();
        ball.setNombre("Gran blanco");
        ball.setLugarOrigen("Oceano");
        ball.setColor("Blanco");
        ball.setNumAletas(2);
        ball.setLargo(30000);
        
        System.out.println(ball);
        
        System.out.println("--metodos--");
        ball.sonido();
        ball.comer();
        ball.nadar();
        ball.pelearConPinocho();
        
        
        System.out.println(" ");
        System.out.println("##############");
        System.out.println("### Perro ###");
        System.out.println("##############");
        System.out.println(" ");
        //Perro.
        Perro per=new Perro();
        per.setNombre("Scooby");
        per.setLugarOrigen("Casa/hogar");
        per.setColor("Cafe con negro");
        per.setPatas(4);
        per.setCollar("Grabado: Scooby");
        
        System.out.println(per);
        
        System.out.println("--metodos--");
        per.sonido();
        per.comer();
        per.correr();
        per.hacerTrucos();
        
        
        System.out.println(" ");
        System.out.println("##############");
        System.out.println("### Pajaro ###");
        System.out.println("##############");
        System.out.println(" ");
        //Pajaro.
        Pajaro paj=new Pajaro();
        paj.setNombre("Tucan");
        paj.setLugarOrigen("America del sur");
        paj.setColor("negro con pico naranja");
        paj.setAlas(2);
        paj.setPico("Pico de canoa");
        
        System.out.println(paj);
        
        System.out.println("--metodos--");
        paj.sonido();
        paj.comer();
        paj.volar();
        paj.recolectarRamas();
        
    }
    
}
