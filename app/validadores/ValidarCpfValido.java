package app.validadores;

import app.Cliente;
import app.execoes.CpfInvalido;

public class ValidarCpfValido extends Validar<Cliente>
{
    final int TAMANHO_CPF = 11;
    @Override
    public void verificar(Cliente cliente) {
        String cpf = cliente.getCpf();
        percorrerCpf(TAMANHO_CPF - 1, cpf);
        percorrerCpf(TAMANHO_CPF, cpf);
    }
    private boolean percorrerCpf(int tamanho , String cpf) 
    {
        int cpfDigito = cpf.charAt(tamanho - 1) - '0';
        int somaProdutos = 0;
        for(int i = 0 ; i < (tamanho - 1) ; i++){
            int valorMultiplicacao =  tamanho - i;
            somaProdutos += (cpf.charAt(i) - '0') * valorMultiplicacao;
        }
        int resultado = somaProdutos % TAMANHO_CPF; 
        resultado = (resultado < 2) ?  0 :  TAMANHO_CPF - resultado;
        return validarDigito(resultado, cpfDigito);
    }

    private boolean validarDigito(int digitoValido, int digitoCpf) throws CpfInvalido
    {
        if(digitoCpf == digitoValido){
            return true;
        }
        throw new CpfInvalido();
    }
}
