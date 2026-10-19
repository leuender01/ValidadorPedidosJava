package app.validadores;
import app.Pagamento;
import app.execoes.ValorBaixo;

public class ValidarValorPagamento extends Validar<Pagamento>
{
    private static final double VALOR_MINIMO = 30.0;
    @Override
    public void verificar(Pagamento pagamento)  throws ValorBaixo
    {
        if(pagamento.getValor() < VALOR_MINIMO)
        {
            throw new ValorBaixo(pagamento.getValor());
        }
    }
}
