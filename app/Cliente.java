package app;

import java.util.Objects;

interface ClienteInterface  
{
    public String getName();
    public int    getIdade();
    public String getCpf();
    public void setName( String name );
    public void setIdade( int idade );
    public void setCpf( String cpf );
}

public class Cliente implements ClienteInterface
{
    private String nome;
    private String cpf;
    private int idade;
    public Cliente(String nome, String cpf, int idade)
    {
        this.idade = idade;
        this.cpf = cpf;
        this.nome = nome;
    }

    /*
    private void validarCliente() throws NomePequeno, TamanhoCpfInvalido, FormatoInvalido, FormatoCpfInvalido
    {
        if(this.nome == null || this.nome.length()  < 7 ) throw new NomePequeno();
        if(!this.nome.matches("^[a-zA-Z].+$") || this.nome.matches("(.)\\1{3,}")) throw new FormatoInvalido();
        if(this.nome.length() > TAMANHO_MAXIMO) throw new NomeGrande();
        if(this.cpf == null || this.cpf.length() < 11 || this.cpf.length() > 11) throw new TamanhoCpfInvalido();
        if(!this.cpf.matches("\\d.*") || this.cpf.matches("(\\d)\\1{3,}")) throw new FormatoCpfInvalido();
        if(this.idade > 120 || this.idade < 18) throw new IdadeInvalida(this.idade);
    }
    */

    @Override
    public String getName(){ return nome; }
    @Override
    public int    getIdade(){ return idade; }
    @Override
    public String getCpf(){ return cpf; }

    @Override
    public void setName( String name ){ this.nome = name; }
    @Override
    public void setIdade( int idade ){ this.idade = idade; }
    @Override
    public void setCpf( String cpf ){ this.cpf = cpf; }
    
    @Override
    public String toString() {
        return "Nome: " + nome + "\n\rIdade: " + idade + "\n\rCpf: " + cpf;
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
