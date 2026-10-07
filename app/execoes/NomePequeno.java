package app.execoes;

public class NomePequeno extends RuntimeException
{
    public NomePequeno()
    {
        super("Nome com tamanho menor");
    }
}
