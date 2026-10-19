package app.validadores;
import app.Pedido;
import app.Endereco;

public class ValidarPedidoEndereco extends Validar<Pedido>
{
    @Override
    public void verificar(Pedido pedido) {
        Validar<Endereco> validarEndereco = 
        new ValidarEnderecoTamanho()
        .setproximo(new ValidarEnderecoFormato()
        )
        ; 
        validarEndereco.validar(pedido.getEndereco());
    }
}
