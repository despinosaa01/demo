/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopolimorfismoinstrumentos;

/**
 *
 * @author ProfDiurno
 */
public class Run7 {

    public static void main(String[] args) {
        Instrumento i1 = new Instrumento();
        Instrumento i2 = new Flauta();
        Instrumento i3 = new Piano();
        Instrumento i4 = new PianoElectrico();
       
        Piano p = (Piano) i4;
        
        ((Piano) i4).tocarAcorde(nota, tipo);
        
        if(i4 instanceof Flauta){
            System.out.println("Instrumento es ");
        }
        i1.tocarNota("Do");
        i2.tocarNota("Do");
        i3.tocarNota("Do");
    }
}
