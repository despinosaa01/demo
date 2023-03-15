/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopolimorfismoinstrumentos;

/**
 *
 * @author ProfDiurno
 */
public class Run3 {
    public static void main(String[] args) {
        Violin v = new Violin();
        v.familia = "perciusion";
        System.out.println(v.familia);
        Instrumento v1 = new Instrumento();
        v1.familia = "perciusion";
        System.out.println(v1.familia);
    }
}
