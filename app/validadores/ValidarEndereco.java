package app.validadores;
import app.Endereco;

public abstract class ValidarEndereco 
{

    private ValidarEndereco proximo;
    protected int camada = 0;
    public ValidarEndereco setproximo(ValidarEndereco proximo) 
    {
        this.proximo = proximo;
        return this;
    }
    public abstract boolean validar(Endereco cliente);
    protected boolean validarProximo(Endereco cliente)
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
