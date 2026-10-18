package app.validadores;
import app.Pedido;
import app.Pagamento;

public class ValidarPedidoPagamento extends ValidarPedido
{
    @Override
    public boolean validar(Pedido pedido) {
        ValidarPagamento validarPagamento = 
        new ValidarValorPagamento()
        .setproximo(new ValidarMetodoPagamento()
        );

        Pagamento pagamento = pedido.getPagamento();
        validarPagamento.validar(pagamento);
        return validarProximo(pedido);
    }
}
