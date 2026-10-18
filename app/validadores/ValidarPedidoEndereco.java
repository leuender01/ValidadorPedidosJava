package app.validadores;
import app.Pedido;

public class ValidarPedidoEndereco extends ValidarPedido
{
    @Override
    public boolean validar(Pedido pedido) {
        ValidarEndereco validarEndereco = 
        new ValidarEnderecoTamanho()
        .setproximo(new ValidarEnderecoFormato()
        )
        ; 
        validarEndereco.validar(pedido.getEndereco());
        return validarProximo(pedido);
    }
}
