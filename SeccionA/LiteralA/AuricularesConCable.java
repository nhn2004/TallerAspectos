package SeccionA.LiteralA;
public class AuricularesConCable extends Auriculares {

    public AuricularesConCable() {
        System.out.println("Auriculares con cable creados.");
    }

    @Override
    public void conectar() {
        System.out.println("Conectando auriculares con cable...");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando auriculares con cable...");
    }
}