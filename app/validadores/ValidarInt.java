package app.validadores;

public abstract class ValidarInt 
{
    private ValidarInt proximo;
    public ValidarInt setproximo(ValidarInt proximo) 
    {
        this.proximo = proximo;
        return proximo;
    }
    public abstract boolean validar(int data);
    protected boolean validarProximo(int data)
    {
        if(proximo == null)
        {
            return true;
        }
        return proximo.validar(data);
    }
}
