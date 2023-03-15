/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopolimorfismoinstrumentos;

/**
 *
 * @author ProfDiurno
 */
public class Run28 {

    public static void main(String[] args) {
        Instrumento i = new Instrumento();
        i.tocarNota("Do");
        i.afinar(440.1);
        Flauta f = new Flauta();
        f.tocarNota("Do");
        f.afinar(440.1);
        Instrumento flauta = new Flauta();
        flauta.tocarNota("La");
        Instrumento[] orquesta = new Instrumento[22];
        orquesta[0] = f;
        orquesta[1] = flauta;
        if (flauta instanceof Object) {
            System.out.println("Flauta");
        }

        Instrumento p = new Piano();
        Piano piano = new Piano();

        ((Piano) p).tocarAcorde("Do", "mayor");
        Piano otro = (Piano) p;
        piano.tocarAcorde("Do", "mayor");

        Piano[] pianos = new Piano[2];
        pianos[0] = otro;
        pianos[1] = (Piano) p;
        
//        orquesta[2] =  (Piano) i; //Errorazo
    }
}
