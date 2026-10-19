package app.validadores;
import java.util.List;
import app.Pedido;
import app.Item;

public class ValidarPedidoItem extends Validar<Pedido>
{
    @Override
    public void verificar(Pedido pedido) {
        Validar<Item> validarItem =
        new ValidarTamanhoNomeItem()
        .setproximo(new ValidarFormatoItem()
        );
        List<Item> items = pedido.listCar();
        for(Item item : items)
        {
            validarItem.validar(item);
        }
    }
}
