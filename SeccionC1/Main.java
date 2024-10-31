package SeccionC1;

import SeccionA.LiteralB.AdaptadorBluetooth;

public class Main {
	public static void main(String[] args) {
		 AdaptadorBluetooth adaptador1 = AdaptadorBluetooth.getInstance();	        
	     // Llama a los métodos para probar la funcionalidad
	     adaptador1.conectar();
	     adaptador1.desconectar();

	     // Intenta obtener otra instancia
	     AdaptadorBluetooth adaptador2 = AdaptadorBluetooth.getInstance();	        
	     System.out.println("¿Es la misma instancia? " + (adaptador1 == adaptador2));
    }
}
