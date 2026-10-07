package app.execoes;

public class EnderecoInvalido extends RuntimeException
{
    public EnderecoInvalido()
    {
        super("Endereco invalido");
    }
}
