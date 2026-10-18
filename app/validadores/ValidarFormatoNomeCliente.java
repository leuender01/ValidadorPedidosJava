package app.validadores;

import app.Cliente;
import app.execoes.FormatoInvalido;

public class ValidarFormatoNomeCliente extends ValidarCliente 
{
    @Override
    public boolean validar(Cliente cliente) {
        if(!cliente.getName().matches("^[a-zA-Z].+$") || cliente.getName().matches("(.)\\1{3,}")) throw new FormatoInvalido();
        return this.validarProximo(cliente);
    }
}
