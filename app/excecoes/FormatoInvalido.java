package app.excecoes;

public class FormatoInvalido extends RuntimeException
{
    public FormatoInvalido()
    {
        super("Formato Invalido de nome! ");
    }
}
