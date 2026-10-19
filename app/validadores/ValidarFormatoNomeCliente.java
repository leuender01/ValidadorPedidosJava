package app.validadores;

import app.Cliente;
import app.excecoes.FormatoInvalido;

public class ValidarFormatoNomeCliente extends Validar<Cliente> 
{
    @Override
    public void verificar(Cliente cliente) {
        if(!cliente.getName().matches("^[a-zA-Z].+$") ||
                cliente.getName().matches("(.)\\1{3,}")) throw new FormatoInvalido();
    }
}
