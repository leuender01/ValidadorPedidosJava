package app.validadores;

import app.execoes.NomeGrande;
import app.execoes.NomePequeno;

public class ValidarTamanhoNomeCliente extends ValidarString
{
    private final int TAMANHO_MAXIMO = 50;

    @Override
    public boolean validar(String data) throws NomeGrande, NomePequeno
    {
        if(data == null ||  data.isEmpty()) throw new NomePequeno();
        if(data.length()  > TAMANHO_MAXIMO) throw new NomeGrande();
        return validarProximo(data);
    }
}
