package app.validadores;
import app.Cliente;
import app.execoes.IdadeInvalida;

public class ValidarIdadeCLiente extends Validar<Cliente> 
{
    @Override
    public void verificar(Cliente cliente) {
        if(cliente.getIdade() > 120 ||
            cliente.getIdade() < 18) throw new IdadeInvalida(cliente.getIdade());
    }
}
