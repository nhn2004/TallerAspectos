package SeccionA.LiteralB;

import SeccionA.LiteralA.Auriculares;
import SeccionA.LiteralA.AuricularesConCable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Prueba con auriculares con cable:");
        Auriculares auricularesConCable = new AuricularesConCable();
        auricularesConCable.conectar();
        auricularesConCable.desconectar();

        System.out.println("\nPrueba con auriculares Bluetooth a través del adaptador Singleton:");
        Auriculares adaptadorBluetooth = AdaptadorBluetooth.getInstance();
        adaptadorBluetooth.conectar();
        adaptadorBluetooth.desconectar();

        // Intento de obtener otra instancia del adaptador (será la misma instancia)
        Auriculares otroAdaptadorBluetooth = AdaptadorBluetooth.getInstance();
        System.out.println("¿Son el mismo adaptador? " + (adaptadorBluetooth == otroAdaptadorBluetooth));
    }
}
