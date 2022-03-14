package EVA1_13_ACCESS_MODIFIERS;

import EVA1_13_ACCESS_MODIFIERS.VEHICULOS_SIN_MOTOR.Bicicletas;

public class EVA1_13_ACCESS_MODIFIERS {

    public static void main(String[] args) {
        Automovil miCarro = new Automovil();
        miCarro.setAño(2000);
        miCarro.imprimirMensaje();
        Bicicletas miBici = new Bicicletas();
        Carreta miCarreta = new Carreta();
    }
}
