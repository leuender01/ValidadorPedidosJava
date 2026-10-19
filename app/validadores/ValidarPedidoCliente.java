package app.validadores;
import app.Pedido;
import app.Cliente;

public class ValidarPedidoCliente extends Validar<Pedido>
{
    @Override
    public void verificar(Pedido pedido) 
    {
        Validar<Cliente> validarCliente =
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
        return;
    }
}
