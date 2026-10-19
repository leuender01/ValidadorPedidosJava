package app.validadores;
import app.Endereco;
import app.excecoes.EnderecoInvalido;

public class ValidarEnderecoTamanho extends Validar<Endereco>
{
    private static final int TAMANHO_MINIMO = 10;
    private static final int TAMANHO_MAXIMO = 200;
    @Override
    public void verificar(Endereco endereco) throws EnderecoInvalido 
    {
        if(endereco.getEndereco() == null  ||
                endereco.getEndereco().length() < TAMANHO_MINIMO ||
                endereco.getEndereco().length() > TAMANHO_MAXIMO) throw new EnderecoInvalido();
    }
}
