package app.validadores;

import app.Item;
import app.excecoes.NomePequeno;

public class ValidarTamanhoNomeItem extends Validar<Item>
{
    private final int TAMANHO_MINIMO = 7;
    @Override
    public void verificar(Item item) throws NomePequeno
    {
        if(item.getName() == null ||
            item.getName().length() < TAMANHO_MINIMO) throw new NomePequeno();
    }
}
