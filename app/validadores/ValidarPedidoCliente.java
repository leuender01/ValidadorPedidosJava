package app.validadores;
import app.Pedido;

public class ValidarPedidoCliente extends ValidarPedido
{
    @Override
    public boolean validar(Pedido pedido) 
    {
        ValidarCliente validarCliente =
        new ValidarTamanhoNomeCliente()
        .setproximo(new ValidarFormatoNomeCliente()
        .setproximo(new ValidarTamanhoCpfCliente()
        .setproximo(new ValidarFormatoCpfCliente()
        .setproximo(new ValidarCpfValido()
        .setproximo(new ValidarIdadeCLiente()
        )
        )
        )
        )
        );
        validarCliente.validar(pedido.getCliente());
        return this.validarProximo(pedido);
    }
}
