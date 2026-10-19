package app.excecoes;

public class NomeGrande extends RuntimeException
{
    public NomeGrande()
    {
        super("Nome muito grande");
    }

    
}
