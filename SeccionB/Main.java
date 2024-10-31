package SeccionB;

import SeccionA.LiteralA.Auriculares;
import SeccionA.LiteralA.AuricularesBluetooth;
import SeccionA.LiteralA.AuricularesConCable;
import SeccionA.LiteralB.AdaptadorBluetooth;

public class Main {
	public static void main(String[] args) {
		AuricularesBluetooth auriculares = new AuricularesBluetooth();

        // Intentar conectar los auriculares
        auriculares.conectar();

        // Ahora desconectarlos
        auriculares.desconectar();
	}     
}
