package app.validadores;

import app.Item;
import app.execoes.FormatoInvalido;

public class ValidarFormatoItem extends Validar<Item>
{
    @Override
    public void verificar(Item item) throws  FormatoInvalido
    {
        if(item.getName() == null || !item.getName().matches("[a-zA-Z].+") || item.getName().matches("(.)\\1{3,}")) throw new FormatoInvalido();
    }
}
