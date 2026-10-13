package app.validadores;
import app.Pagamento;

public abstract class ValidarPagamento {
    private ValidarPagamento proximo;
    protected int camada = 0;
    public ValidarPagamento setproximo(ValidarPagamento proximo) 
    {
        this.proximo = proximo;
        return this;
    }
    public abstract boolean validar(Pagamento pagamento);
    protected boolean validarProximo(Pagamento pagamento)
    {
        if(proximo == null)
        {
            return true;
        }
        proximo.camada = this.camada  + 1;
        return proximo.validar(pagamento);
    }
    protected int getCamada() { return this.camada; }
}
