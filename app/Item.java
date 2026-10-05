package app;
import java.util.Objects;

public class Item
{
    private String nome;
    private int quantidade = 0;

    public Item(String nome)
    {
        this.nome = nome;
        this.quantidade = 1;
    }
    
    public void interar(){ quantidade++; }
    public void retirar(){ quantidade--; }
    public int getSize(){ return quantidade; }

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
