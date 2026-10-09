package app.validadores;
import app.Cliente;

public abstract class  ValidarCliente
{
    private ValidarCliente proximo;
    protected int camada = 0;
    public ValidarCliente setproximo(ValidarCliente proximo) 
    {
        this.proximo = proximo;
        return this;
    }
    public abstract boolean validar(Cliente cliente);
    protected boolean validarProximo(Cliente cliente)
    {
        if(proximo == null)
        {
            return true;
        }
        proximo.camada = this.camada  + 1;
        return proximo.validar(cliente);
    }
    protected int getCamada() { return this.camada; }
}
