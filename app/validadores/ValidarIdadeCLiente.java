package app.validadores;
import app.Cliente;
import app.execoes.IdadeInvalida;

public class ValidarIdadeCLiente extends ValidarCliente 
{
    @Override
    public boolean validar(Cliente cliente) {
        if(cliente.getIdade() > 120 || cliente.getIdade() < 18) throw new IdadeInvalida(cliente.getIdade());
        System.out.println(getCamada());
        return this.validarProximo(cliente);
    }
}
