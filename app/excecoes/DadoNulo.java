package app.excecoes;

public class DadoNulo extends RuntimeException
{
    public DadoNulo()
    {
        super("Dado nulo");
    }
}
