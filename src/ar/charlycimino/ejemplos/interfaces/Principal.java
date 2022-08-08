package ar.charlycimino.ejemplos.interfaces;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PartidoDelBuenCodigo p = new PartidoDelBuenCodigo();
        
        p.agregarMensajero(new PalomaMensajera());
        p.agregarMensajero(new TelefonoMovil());
        p.agregarMensajero(new PalomaMensajera());
        p.agregarMensajero(new Persona());
        p.agregarMensajero(new TelefonoMovil());
        p.agregarMensajero(new PalomaMensajera());
        p.agregarMensajero(new TelefonoMovil());
        
        p.hacerCampania();
    }
    
}
