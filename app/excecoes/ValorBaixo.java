package app.excecoes;

public class ValorBaixo extends RuntimeException 
{
    public ValorBaixo(double pay)
    {
        super("Valor muito baixo: " + pay);
    }
}
