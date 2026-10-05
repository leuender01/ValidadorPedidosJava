package app;

enum MetodoPagamento
{
    PIX,
    CARTAO_CREDITO,
    CARTAO_DEBITO,
    BOLETO
}

public class Pagamento
{
    MetodoPagamento metodoPagamento;
    public Pagamento(MetodoPagamento pay)
    {
        this.metodoPagamento = pay;
    }

    public void setMetodoPagamento(MetodoPagamento metodoPagamento){ this.metodoPagamento = metodoPagamento; }

    @Override
    public String toString() { return metodoPagamento.toString();}
}
