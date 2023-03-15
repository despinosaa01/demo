/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

/**
 *
 * @author ProfDiurno
 */
public class Habitacion {

    private String des;
    private Habitacion sNorte;
    private Habitacion sSur;
    private Habitacion sEste;
    private Habitacion sOeste;

    public Habitacion(String info) {
        this.descripcion = info;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDescripcionLarga() {
        return "Estás en " + this.getDescripcion()
                + "\nY tus salidas son :"
                + this.getStringDeSalidas();
    }

    public void setSalida(String direccion, Habitacion salida) {
        switch (direccion) {
            case "norte":
                this.sNorte = salida;
                break;
            case "este":
                this.sEste = salida;
                break;
            case "oeste":
                this.sOeste = salida;
                break;
            case "sur":
                this.sSur = salida;
                break;
            default:
                break;
        }
    }
    
    public Habitacion getSalida(String direccion) {
        switch (direccion) {
            case "norte":
                return this.sNorte;
            case "este":
                return this.sEste;
            case "oeste":
                return this.sOeste;
            case "sur":
                return this.sSur;
            default:
                return null;
        }
    }
    

    public String getStringDeSalidas() {
        String salida = "Salidas: ";
        if (this.sNorte != null) {
            salida += "Norte ";
        }
        if (this.sEste != null) {
            salida += "Este ";
        }
        if (this.sSur != null) {
            salida += "Sur ";
        }
        if (this.sOeste != null) {
            salida += "Oeste ";
        }
        return salida;
    }

}
