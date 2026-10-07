package app.validadores;
import app.execoes.IdadeInvalida;

public class ValidarIdade extends ValidarInt 
{
    @Override
    public boolean validar(int data) throws IdadeInvalida
    {
        if(data > 120 || data < 18) throw new IdadeInvalida(data);
        return validarProximo(data);
    }
}
