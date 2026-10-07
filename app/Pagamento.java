package app;

import app.execoes.MetodoPagamentoInvalido;
import app.execoes.ValorBaixo;

public class Pagamento
{
    private MetodoPagamento metodoPagamento;
    private double value;
    private final double VALOR_MINIMO = 30.0;

    public Pagamento(MetodoPagamento pay, double value)
    {
        this.metodoPagamento = pay;
        this.value = value;
        validarCLente();
    }
    private void validarCLente() throws MetodoPagamentoInvalido, ValorBaixo
    {
        if(this.metodoPagamento == null) throw new MetodoPagamentoInvalido();
        if(this.value < VALOR_MINIMO) throw new ValorBaixo(this.value);
    }

    @Override
    public String toString() { return metodoPagamento.toString();}
}
