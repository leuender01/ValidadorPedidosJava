package app.validadores;

import app.Item;

public abstract class ValidarItem
{
    private ValidarItem proximo;
    protected int camada = 0;
    public ValidarItem setproximo(ValidarItem proximo) 
    {
        this.proximo = proximo;
        return this;
    }
    public abstract boolean validar(Item item);
    protected boolean validarProximo(Item cliente)
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
