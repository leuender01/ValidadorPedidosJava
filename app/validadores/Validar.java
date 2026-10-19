package app.validadores;
import app.excecoes.DadoNulo;

public abstract class Validar<T>
{
    private Validar<T> proximo;
    public Validar<T> setProximo(Validar<T> proximo) 
    {
        this.proximo = proximo;
        return this;
    }
    public  boolean validar(T object)
    {
        if(object == null) throw new DadoNulo();
        verificar(object);
        return validarProximo(object);
    }
    protected boolean validarProximo(T object)
    {
        if(proximo == null)
        {
            return true;
        }
        return proximo.validar(object);
    }
    protected abstract void verificar(T object);
}
