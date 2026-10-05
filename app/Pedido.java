package app;

import java.util.ArrayList;
import java.util.List;

interface PedidoInteface {
    public boolean addItem(String nomeItem);
    public boolean removeItem(String nomeItem);
}

public class Pedido implements PedidoInteface{
    List<Item> itemList = new ArrayList<Item>();
    Cliente cliente;
    Pagamento pagamento;
    String endereco;
    public Pedido(String endereco, Cliente cliente, Pagamento pagamento)
    {
        this.cliente = cliente;
        this.pagamento = pagamento;
        this.endereco = endereco;
    }
    @Override
    public boolean addItem(String nomeItem) {
        return true;
    }
    @Override
    public boolean removeItem(String nomeItem) {
        return false;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente + "\n\rMetodoPagamento: " + pagamento + "Endereço: " + endereco;
    }

}

