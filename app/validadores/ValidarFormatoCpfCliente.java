package app.validadores;

import app.excecoes.FormatoCpfInvalido;
import app.Cliente;

public class ValidarFormatoCpfCliente extends Validar<Cliente>
{
    @Override
    public void verificar(Cliente cliente) {
        if(cliente.getCpf().matches("(.)\\1{3,}") ||
                !cliente.getCpf().matches("^\\d+$")) throw new FormatoCpfInvalido();
    }
}
