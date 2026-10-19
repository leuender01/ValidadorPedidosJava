package app.validadores;
import app.MetodoPagamento;
import app.Pagamento;
import app.excecoes.MetodoPagamentoInvalido;

/*
    private void validarCLente() throws MetodoPagamentoInvalido, ValorBaixo
    {
        if(this.metodoPagamento == null) throw new MetodoPagamentoInvalido();
        if(this.value < VALOR_MINIMO) throw new ValorBaixo(this.value);
    }
 */
public class ValidarMetodoPagamento extends Validar<Pagamento>
{
    private static final MetodoPagamento[] METODOS_VALIDOS = {MetodoPagamento.BOLETO, MetodoPagamento.CARTAO_DEBITO, MetodoPagamento.CARTAO_CREDITO, MetodoPagamento.PIX}; 
    @Override
    public void verificar(Pagamento pagamento) 
    {
        if(pagamento.getMetodoPagamento() == null) throw new MetodoPagamentoInvalido();
        for(MetodoPagamento metodo : METODOS_VALIDOS)
        {
            if(pagamento.getMetodoPagamento() == metodo) return;
        }
        throw new MetodoPagamentoInvalido();
    }
}
