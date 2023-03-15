package ejemplopolimorfismoinstrumentos;

/**
 *
 * Clase Instrumento
 */
public class Instrumento {

    protected String familia;
    private double afinacionLa;
//    private Persona instrumentista;

    public Instrumento() {
        System.out.println("Se ha creado un instrumento");
    }

    
    
    public void afinar(double afinacion) {
        this.afinacionLa = afinacion;
        System.out.println("Instrumento afinado a " + afinacion + "Hz");
    }

    /**
     * Método que escribe como se toca una nota que recibe por parámetro
     *
     * @param nota Nota que va a ser tocada
     */
    protected void tocarNota(String nota) {
        System.out.printf("Tocar nota %s.\n", nota);
//        System.out.printf("Tocar nota " + nota + ".\n");
//        System.out.print("Tocar nota " + nota + "\n");
//        System.out.println("Tocar nota " + nota);
    }

}
