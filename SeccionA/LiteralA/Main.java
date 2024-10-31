package SeccionA.LiteralA;
public class Main {
    public static void main(String[] args) {
        System.out.println("Prueba con auriculares con cable:");
        Auriculares auricularesConCable = new AuricularesConCable();
        auricularesConCable.conectar();
        auricularesConCable.desconectar();

        System.out.println("\nPrueba con auriculares Bluetooth a través del adaptador:");
        Auriculares adaptadorBluetooth = new AdaptadorBluetooth();
        adaptadorBluetooth.conectar();
        adaptadorBluetooth.desconectar();
    }
}
