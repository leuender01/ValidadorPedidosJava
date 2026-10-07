package app.validadores;

import app.execoes.FormatoCpfInvalido;

public class ValidarFormatoCpf extends ValidarString
{
    @Override
    public boolean validar(String data) {
        if(data.matches("(.)\\1{3,}")) throw new FormatoCpfInvalido();
        return validarProximo(data);
    }
}
