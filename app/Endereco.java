package app;

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
    }

    @Override
    public String getEndereco() { return endereco; }

   @Override
   public String toString() {
       return endereco;
   }
    
}
