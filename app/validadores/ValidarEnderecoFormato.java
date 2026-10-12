package app.validadores;
import app.execoes.FormatoInvalido;
import app.Endereco;

public class ValidarEnderecoFormato extends ValidarEndereco
{
    @Override
    public boolean validar(Endereco endereco) throws FormatoInvalido
    {
        if(endereco.getEndereco() == null  ||  endereco.getEndereco().matches("(.)\\1{3,}") || !endereco.getEndereco().matches("^[Rr]ua.*\\d,.*[Qq]dra.*\\d,.*[lL]ot.*\\d.*$")) throw new FormatoInvalido();
        System.out.println(getCamada());
        return this.validarProximo(endereco);
    }

    
}
