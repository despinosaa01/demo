/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopolimorfismoinstrumentos;

/**
 *
 * @author ProfDiurno
 */
public class Run01 {

    public static void main(String[] args) {
        Instrumento i = new Instrumento();
        Instrumento f = new Flauta();
        Instrumento p = new Piano();
        i.afinar(440);
        i.tocarNota("La");
        f.afinar(440);
        f.tocarNota("Re");
        p.afinar(440);
        p.tocarNota("Fa");
        ((Piano) p).tocarAcorde("Re", "menor");
    }
}
