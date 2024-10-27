public class AdaptadorBluetooth extends Auriculares {
    private AuricularesBluetooth auricularesBluetooth;

    public AdaptadorBluetooth() {
        super();
        this.auricularesBluetooth = new AuricularesBluetooth();
        System.out.println("Creando adaptador para auriculares Bluetooth.");
    }

    @Override
    public void conectar() {
        System.out.println("Usando adaptador para conectar auriculares Bluetooth...");
        this.auricularesBluetooth.emparejar();
        this.auricularesBluetooth.conectar();
    }

    @Override
    public void desconectar() {
        System.out.println("Usando adaptador para desconectar auriculares Bluetooth...");
        this.auricularesBluetooth.desconectar();
    }
}