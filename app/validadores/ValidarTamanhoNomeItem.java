package app.validadores;

import app.Item;
import app.execoes.NomePequeno;

public class ValidarTamanhoNomeItem extends ValidarItem
{
    private final int TAMANHO_MINIMO = 7;
    @Override
    public boolean validar(Item item) throws NomePequeno
    {
        if(item.getName() == null || item.getName().length() < TAMANHO_MINIMO) throw new NomePequeno();
        return this.validarProximo(item);
    }
}
