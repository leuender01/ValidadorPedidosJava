package app.validadores;
import app.Pagamento;
import app.execoes.ValorBaixo;

/*
    private void validarCLente() throws MetodoPagamentoInvalido, ValorBaixo
    {
        if(this.metodoPagamento == null) throw new MetodoPagamentoInvalido();
        if(this.value < VALOR_MINIMO) throw new ValorBaixo(this.value);
    }
 */
public class ValidarValorPagamento extends ValidarPagamento
{
    private static final double VALOR_MINIMO = 30.0;
    @Override
    public boolean validar(Pagamento pagamento)  throws ValorBaixo
    {
        if(pagamento.getValor() < VALOR_MINIMO)
        {
            throw new ValorBaixo(pagamento.getValor());
        }
        return validarProximo(pagamento);
    }
}
