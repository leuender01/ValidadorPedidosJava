package app.execoes;

public class TamanhoCpfInvalido extends RuntimeException 
{
    public TamanhoCpfInvalido()
    {
        super("Tamanho de Cpf invalido");
    }
}
