public class Main {
    public static void main(String[] args) {
        Logger logger1 = new Logger();
        logger1.log("Primer mensaje");

        Logger logger2 = new Logger();
        logger2.log("Segundo mensaje");

        // Verifica que ambas referencias apunten a la misma instancia
        System.out.println(logger1 == logger2); // Debe imprimir "true"
    }
}
