package app.validadores;
import app.Pedido;
import app.Pagamento;

public class ValidarPedidoPagamento extends Validar<Pedido>
{
    @Override
    public void verificar(Pedido pedido) {
        Validar<Pagamento> validarPagamento = 
        new ValidarValorPagamento()
        .setproximo(new ValidarMetodoPagamento()
        );

        Pagamento pagamento = pedido.getPagamento();
        validarPagamento.validar(pagamento);
    }
}
