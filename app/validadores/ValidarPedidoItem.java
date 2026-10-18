package app.validadores;

import java.util.List;
import app.Pedido;
import app.Item;

public class ValidarPedidoItem extends ValidarPedido
{
    @Override
    public boolean validar(Pedido pedido) {
        ValidarItem validarItem =
        new ValidarTamanhoNomeItem()
        .setproximo(new ValidarFormatoItem()
        );
        List<Item> items = pedido.listCar();
        for(Item item : items)
        {
            validarItem.validar(item);
        }
        return validarProximo(pedido);
    }
}
