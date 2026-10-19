package app.excecoes;

public class EnderecoInvalido extends RuntimeException
{
    public EnderecoInvalido()
    {
        super("Endereco invalido");
    }
}
