public class BurradasNOException extends Exception
{
    public BurradasNOException()
    {
        super("Error no se permite lenguaje obsceno.");
    }
    public BurradasNOException(String mensaje)
    {
        super(mensaje);
    }
}
