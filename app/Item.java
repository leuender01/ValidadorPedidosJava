package app;
import java.util.Objects;

import app.execoes.FormatoInvalido;
import app.execoes.NomePequeno;
import app.execoes.QuantidadeInvalida;

public class Item
{
    private String nome;
    private int quantidade = 0;

    public Item(String nome)
    {
        this.nome = nome;
        this.quantidade = 1;
        validarItem();
    }
    /*
     Nao consulta banco de dados por motivos de ser apenas uma aplicação de conseitos "Por enquanto o limite e infinito"
    */
    public void interar(){ quantidade++; }

    public void retirar()
    {
        validarQuantidade();
        quantidade--; 
    }

    public int getSize(){ return quantidade; }

    private void validarItem() throws NomePequeno, FormatoInvalido
    {
        if(this.nome == null || this.nome.length() < 7) throw new NomePequeno();
        if(!this.nome.matches("[a-zA-Z].+") || this.nome.matches("(.)\\1{3,}")) throw new FormatoInvalido();
    }
    private void validarQuantidade() throws QuantidadeInvalida
    {
        if(this.quantidade < 0) throw new QuantidadeInvalida();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Item o = (Item) obj;
        return Objects.equals(o.nome, nome);
    }
    @Override
    public String toString() { return "Nome: " + nome + "\n\rQuantidade: " + quantidade; }
    @Override
    public int hashCode() { return Objects.hashCode(nome); }
}
