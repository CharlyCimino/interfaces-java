package ar.charlycimino.ejemplos.interfaces;

public class TelefonoMovil extends Dispositivo implements EnviadorDeMensaje {

    public void llamar() {
        System.out.println("Llamando...");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        encender();
        System.out.println(" Conectando con la API de WhatsApp para enviar un mensaje que dice: " + mensaje);
    }

}
