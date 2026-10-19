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
        .setProximo(new ValidarFormatoNomeCliente()
        .setProximo(new ValidarTamanhoCpfCliente()
        .setProximo(new ValidarFormatoCpfCliente()
        .setProximo(new ValidarCpfValido()
        .setProximo(new ValidarIdadeCliente()
        )
        )
        )
        )
        );
        validarCliente.validar(pedido.getCliente());
        return;
    }
}
