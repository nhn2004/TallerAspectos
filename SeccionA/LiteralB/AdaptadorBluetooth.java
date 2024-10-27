package SeccionA.LiteralB;

import SeccionA.LiteralA.Auriculares;
import SeccionA.LiteralA.AuricularesBluetooth;

public class AdaptadorBluetooth extends Auriculares {
    private static AdaptadorBluetooth instance;
    private AuricularesBluetooth auricularesBluetooth;

    // Constructor privado para evitar instancias directas
    private AdaptadorBluetooth() {
        super();
        this.auricularesBluetooth = new AuricularesBluetooth();
        System.out.println("Creando instancia única del adaptador para auriculares Bluetooth.");
    }

    // Método estático para obtener la única instancia de AdaptadorBluetooth
    public static AdaptadorBluetooth getInstance() {
        if (instance == null) {
            instance = new AdaptadorBluetooth();
        }
        return instance;
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
