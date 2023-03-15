package ejemplopolimorfismoinstrumentos;


/**
 *
 * Clase Flauta
 */
public class Flauta extends Instrumento {

    public Flauta() {
        System.out.println("Se ha creado una flauta");
    }
    
    
    
    @Override //Sobrescribir
    public void tocarNota (String nota) {
        System.out.println ("Soplar nota: " + nota);
    }
    //Sobrecarcar
    public void tocarNota () {
        tocarNota("Do");
    }
        
}
