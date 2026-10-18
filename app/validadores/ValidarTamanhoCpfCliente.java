package app.validadores;

import app.execoes.TamanhoCpfInvalido;
import app.Cliente;

public class ValidarTamanhoCpfCliente extends ValidarCliente
{
    @Override
    public boolean validar(Cliente cliente) throws TamanhoCpfInvalido 
    {
        if (cliente.getCpf() == null || cliente.getCpf().isEmpty() || cliente.getCpf().length() != TAMANHO_CPF  )  throw new TamanhoCpfInvalido();
        return this.validarProximo(cliente);
    }
}
