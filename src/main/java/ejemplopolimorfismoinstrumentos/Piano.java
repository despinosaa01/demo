package ejemplopolimorfismoinstrumentos;

/**
 *
 * Clase Piano
 */
public class Piano extends Instrumento {

    public Piano() {
        System.out.println("piano creado");
    }

    
    
    public void tocarAcorde(String nota, String tipo){
        System.out.println("El piano toca un acorde de "+
                nota + " " + tipo);
    }
    
    @Override
    public void tocarNota(String nota) {
        System.out.print("Piano: ");
        super.tocarNota(nota);
    }
}
