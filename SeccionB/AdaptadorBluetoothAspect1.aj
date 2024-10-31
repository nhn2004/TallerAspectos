package SeccionB;

import SeccionA.LiteralA.AuricularesBluetooth;

public aspect AdaptadorBluetoothAspect1 {
	pointcut conectarBluetooth(): execution(void AuricularesBluetooth.conectar());
	
	pointcut desconectarBluetooth() : execution(void AuricularesBluetooth.desconectar());
	
	void around() : conectarBluetooth() {
        AuricularesBluetooth auricularesBluetooth = (AuricularesBluetooth) thisJoinPoint.getTarget();
        if (!auricularesBluetooth.emparejados) {
            System.out.println("Adaptador: Emparejando automáticamente los auriculares Bluetooth...");
            auricularesBluetooth.emparejar();
        }
        System.out.println("Adaptador: Conectando auriculares Bluetooth a través del adaptador...");
        proceed(); // Llamada al método original de conectar
    }
	
	// Advice que asegura la desconexión de los auriculares Bluetooth
    void around() : desconectarBluetooth() {
        System.out.println("Adaptador: Desconectando auriculares Bluetooth a través del adaptador...");
        proceed(); // Llamada al método original de desconectar
    }
}
