/*
    private void validarItem() throws NomePequeno, FormatoInvalido
    {
        if(this.nome == null || this.nome.length() < 7) throw new NomePequeno();
        if(!this.nome.matches("[a-zA-Z].+") || this.nome.matches("(.)\\1{3,}")) throw new FormatoInvalido();
    }
    */
package app.validadores;

import app.Item;
import app.execoes.FormatoInvalido;

public class ValidarFormatoItem extends ValidarItem
{
    @Override
    public boolean validar(Item item) throws  FormatoInvalido
    {
        if(item.getName() == null || !item.getName().matches("[a-zA-Z].+") || item.getName().matches("(.)\\1{3,}")) throw new FormatoInvalido();
        return this.validarProximo(item);
    }
}
