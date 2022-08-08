package ar.charlycimino.ejemplos.interfaces;

import java.util.ArrayList;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class PartidoDelBuenCodigo {

    private ArrayList<EnviadorDeMensaje> mensajeros;
    
    public PartidoDelBuenCodigo() {
        mensajeros = new ArrayList<>();
    }
    
    public void agregarMensajero(EnviadorDeMensaje mensajero) {
        this.mensajeros.add(mensajero);
    }
    
    public void hacerCampania() {
        for (EnviadorDeMensaje mensajero : mensajeros) {
            mensajero.enviarMensaje("Vote por el Partido del Buen Código");
        }
    }
    
}
