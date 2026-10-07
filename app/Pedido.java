package app;
import java.util.ArrayList;
import java.util.List;

interface PedidoInteface {
    public boolean addItem(Item item);
    public boolean removeItem(Item item);
    public List<Item> listCar();
}

public class Pedido implements PedidoInteface
{
    private   List<Item> itemList = new ArrayList<Item>();
    private   Cliente cliente;
    private   Pagamento pagamento;
    private   Endereco endereco;

    public Pedido(Endereco endereco, Cliente cliente, Pagamento pagamento)
    {
        this.cliente = cliente;
        this.pagamento = pagamento;
        this.endereco = endereco;
    }

    @Override
    public boolean addItem(Item item) {
        boolean resultado = false;
        for(Item itemExistes : this.itemList)
        {
            if(itemExistes.equals(item))
            {
                itemExistes.interar();
                resultado = true;
                break;
            }
        }
        if(resultado != true) resultado = this.itemList.add(item);
        return resultado;
    }

    @Override
    public boolean removeItem(Item item) {
        boolean resultado = false;
        for(Item itemExistes : this.itemList)
        {
            if(itemExistes.equals(item))
            {
                itemExistes.retirar();
                resultado = ( itemExistes.getSize() < 1 )?  false : true ;
                break;
            }
        }
        if(resultado != true) resultado = this.itemList.remove(item);
        return resultado;
    }

    @Override
    public List<Item> listCar() { return this.itemList; }

    @Override
    public String toString() {
        return cliente + "\n\rMetodoPagamento: " + pagamento + "\n\rEndereço: " + endereco;
    }
}
