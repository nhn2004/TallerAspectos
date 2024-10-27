import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggerSingletonAspect {
    private static Logger instance = null;

    // Intercepta todas las creaciones de instancias de Logger
    @Around("execution(public Logger.new())")
    public Logger enforceSingleton(ProceedingJoinPoint joinPoint) throws Throwable {
        if (instance == null) {
            // Crea la instancia solo si aún no existe
            instance = (Logger) joinPoint.proceed();
        }
        return instance;
    }
}
