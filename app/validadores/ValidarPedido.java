package app.validadores;
import app.Pedido;

public abstract class ValidarPedido
{
    private ValidarPedido proximo;
    protected int camada = 0;
    public ValidarPedido setproximo(ValidarPedido proximo) 
    {
        this.proximo = proximo;
        return this;
    }
    public abstract boolean validar( Pedido pedido);
    protected boolean validarProximo(Pedido pedido)
    {
        if(proximo == null)
        {
            return true;
        }
        proximo.camada = this.camada  + 1;
        return proximo.validar(pedido);
    }
}
