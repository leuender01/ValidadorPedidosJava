package app.validadores;

import app.Cliente;
import app.execoes.NomeGrande;
import app.execoes.NomePequeno;

public class ValidarTamanhoNomeCliente extends ValidarCliente
{
    private final int TAMANHO_MAXIMO = 50;
    private final int TAMANHO_MINIMO = 5;

    @Override
    public boolean validar(Cliente cliente) throws NomeGrande, NomePequeno
    {
        if(cliente.getName() == null ||  cliente.getName().isEmpty() || cliente.getName().length() < TAMANHO_MINIMO) throw new NomePequeno();
        if(cliente.getName().length()  > TAMANHO_MAXIMO) throw new NomeGrande();
        System.out.println(getCamada());
        return this.validarProximo(cliente);
    }
}
