package app.validadores;
import app.excecoes.FormatoInvalido;
import app.Endereco;

public class ValidarEnderecoFormato extends Validar<Endereco>
{
    @Override
    public void verificar(Endereco endereco) throws FormatoInvalido
    {
        if(endereco.getEndereco() == null  ||
           endereco.getEndereco().matches("(.)\\1{3,}") ||
           !endereco.getEndereco().matches("^[Rr]ua.*\\d,.*[Qq]dra.*\\d,.*[lL]ot.*\\d.*$")) throw new FormatoInvalido();
    }
}
