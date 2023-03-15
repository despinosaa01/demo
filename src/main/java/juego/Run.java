/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

/**
 *
 * @author ProfDiurno
 */
public class Run {

    public static void main(String[] args) {
        Habitacion h1 = new Habitacion("entrada");
        Habitacion h2 = new Habitacion("pasillo");
        Habitacion h3 = new Habitacion("escalera");
        Habitacion h4 = new Habitacion("pasillo planta");
        Habitacion h5 = new Habitacion("entrada clase");

        h1.setSalida("este", h2);
        
        h2.setSalida("oeste", h1);
        h2.setSalida("sur", h3);
        
        h3.setSalida("norte", h2);
        h3.setSalida("oeste", h1);
        h3.setSalida("sur", h4);
        
        h4.setSalida("este", h5);
        h4.setSalida("norte", h3);
        h4.setSalida("oeste", h2);
        
        Habitacion actual = h1;
        System.out.println(actual.getDescripcionLarga());
        actual = actual.getSalida("este");
        System.out.println(actual.getDescripcionLarga());
        actual = actual.getSalida("sur");
        System.out.println(actual.getDescripcionLarga());
        
        
    }
}
