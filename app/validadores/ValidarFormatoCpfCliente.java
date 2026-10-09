package app.validadores;

import app.execoes.FormatoCpfInvalido;
import app.Cliente;

public class ValidarFormatoCpfCliente extends ValidarCliente
{
    @Override
    public boolean validar(Cliente cliente) {
        if(cliente.getCpf().matches("(.)\\1{3,}") || !cliente.getCpf().matches("^\\d+$")) throw new FormatoCpfInvalido();
        System.out.println(getCamada());
        return this.validarProximo(cliente);
    }
}
