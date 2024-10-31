package SeccionC;
public aspect AdaptadorBluetoothAspect {
    private static AdaptadorBluetooth instance = null;

    pointcut crearInstancia(): call(AdaptadorBluetooth.new());

    // Advice para controlar la creación de la instancia
    AdaptadorBluetooth around(): crearInstancia() {
        if (instance == null) {
            instance = new AdaptadorBluetooth();
        }
        return instance;
    }

    public static AdaptadorBluetooth getInstance() {
        if (instance == null) {
            instance = new AdaptadorBluetooth();
        }
        return instance;
    }
}