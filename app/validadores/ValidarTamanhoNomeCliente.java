package app.validadores;

import app.Cliente;
import app.execoes.NomeGrande;
import app.execoes.NomePequeno;

public class ValidarTamanhoNomeCliente extends Validar<Cliente>
{
    private final int TAMANHO_MAXIMO = 50;
    private final int TAMANHO_MINIMO = 5;
    @Override
    public void verificar(Cliente cliente) throws NomeGrande, NomePequeno
    {
        if(cliente.getName() == null ||  cliente.getName().isEmpty() || cliente.getName().length() < TAMANHO_MINIMO) throw new NomePequeno();
        if(cliente.getName().length()  > TAMANHO_MAXIMO) throw new NomeGrande();
    }
}
