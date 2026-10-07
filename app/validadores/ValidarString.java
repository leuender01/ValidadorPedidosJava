package app.validadores;

public abstract class  ValidarString
{
    private ValidarString proximo;
    public ValidarString setproximo(ValidarString proximo) 
    {
        this.proximo = proximo;
        return proximo;
    }
    public abstract boolean validar(String data);
    protected boolean validarProximo(String data)
    {
        if(proximo == null)
        {
            return true;
        }
        return proximo.validar(data);
    }
}
