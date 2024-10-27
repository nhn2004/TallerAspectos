public class AuricularesBluetooth {

    private boolean emparejados = false;

    public AuricularesBluetooth() {
        System.out.println("Auriculares Bluetooth creados.");
    }

    public void emparejar() {
        System.out.println("Emparejando auriculares Bluetooth...");
        this.emparejados = true;
    }

    public void conectar() {
        if (emparejados) {
            System.out.println("Conectando auriculares Bluetooth...");
        } else {
            System.out.println("No se pueden conectar los auriculares Bluetooth sin emparejar.");
        }
    }

    public void desconectar() {
        System.out.println("Desconectando auriculares Bluetooth...");
        this.emparejados = false;
    }
}