package app.validadores;
import app.Endereco;
import app.execoes.EnderecoInvalido;

public class ValidarEnderecoTamanho extends ValidarEndereco
{
    private static final int TAMANHO_MINIMO = 10;
    private static final int TAMANHO_MAXIMO = 200;
    @Override
    public boolean validar(Endereco endereco) throws EnderecoInvalido 
    {
        if(endereco.getEndereco() == null  || endereco.getEndereco().length() < TAMANHO_MINIMO || endereco.getEndereco().length() > TAMANHO_MAXIMO) throw new EnderecoInvalido();
        System.out.println(getCamada());
        return this.validarProximo(endereco);
    }
}
