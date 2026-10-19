package app.excecoes;

public class NomePequeno extends RuntimeException
{
    public NomePequeno()
    {
        super("Nome com tamanho menor");
    }
}
