package app;
import app.execoes.EnderecoInvalido;
import app.execoes.FormatoInvalido;

interface EnderecoInterface
{
    String getEndereco();
}

public class Endereco implements EnderecoInterface
{
    private String endereco;

    public Endereco(String enderecoString)
    {
        this.endereco = enderecoString;
        validarEndereco();
    }

    @Override
    public String getEndereco() { return endereco; }

    private void validarEndereco() throws EnderecoInvalido, FormatoInvalido
    {
        if(this.endereco == null || this.endereco.length() < 12) throw new EnderecoInvalido();
        if(this.endereco.matches("(.)\\1{3,}") || !this.endereco.matches("^[Rr]ua.*\\d,.*[Qq]dra.*\\d,.*[lL]ot.*\\d.*$")) throw new FormatoInvalido();
    }
   @Override
   public String toString() {
       return endereco;
   }
    
}
