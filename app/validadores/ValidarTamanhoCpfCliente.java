package app.validadores;

import app.execoes.TamanhoCpfInvalido;
import app.Cliente;

public class ValidarTamanhoCpfCliente extends ValidarCliente
{

    private final int TAMANHO_CPF = 11;
    @Override
    public boolean validar(Cliente cliente) throws TamanhoCpfInvalido 
    {
        if (cliente.getCpf() == null || cliente.getCpf().isEmpty() || cliente.getCpf().length() != TAMANHO_CPF  )  throw new TamanhoCpfInvalido();
        System.out.println(getCamada());
        return this.validarProximo(cliente);
    }
}
