package app.validadores;

import app.execoes.FormatoInvalido;

public class ValidarFormatoStringCliente extends ValidarString 
{
    @Override
    public boolean validar(String data) throws FormatoInvalido
    {
        if(!data.matches("^[a-zA-Z].+$") || data.matches("(.)\\1{3,}")) throw new FormatoInvalido();
        return validarProximo(data);
    }
}
