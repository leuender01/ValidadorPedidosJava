package app.validadores;
import app.Cliente;
import app.excecoes.IdadeInvalida;

public class ValidarIdadeCliente extends Validar<Cliente> 
{
    @Override
    public void verificar(Cliente cliente) {
        if(cliente.getIdade() > 120 ||
            cliente.getIdade() < 18) throw new IdadeInvalida(cliente.getIdade());
    }
}
