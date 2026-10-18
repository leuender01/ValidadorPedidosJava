package app;

public class Pagamento
{
    private MetodoPagamento metodoPagamento;
    private double value;

    public Pagamento(MetodoPagamento pay, double value)
    {
        this.metodoPagamento = pay;
        this.value = value;
    }
    public MetodoPagamento getMetodoPagamento() { return this.metodoPagamento; }
    public double getValor() { return this.value; }

    @Override
    public String toString() { return (metodoPagamento != null) ? metodoPagamento.toString() : "NULL";}
}
