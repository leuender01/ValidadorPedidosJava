package app.validadores;

import app.execoes.TamanhoCpfInvalido;

public class ValidarTamanhoCpf extends ValidarString{

    private final int TAMANHO_CPF = 11;
    @Override
    public boolean validar(String data) throws TamanhoCpfInvalido 
    {
        if (data == null || data.isEmpty() || data.length() > TAMANHO_CPF || data.length() < TAMANHO_CPF )  throw new TamanhoCpfInvalido();
        return validarProximo(data);
    }
}
