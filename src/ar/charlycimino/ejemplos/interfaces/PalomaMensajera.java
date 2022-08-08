package ar.charlycimino.ejemplos.interfaces;

public class PalomaMensajera extends Ave implements EnviadorDeMensaje {

    public void volarRapido() {
        System.out.print("Volando...");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        volarRapido();
        System.out.println(" Lanzando un papelito que dice: " + mensaje);
    }

}
