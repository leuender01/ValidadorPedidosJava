package app.tests;
import app.Endereco;
import app.validadores.ValidarEndereco;
import app.validadores.ValidarEnderecoFormato;
import app.validadores.ValidarEnderecoTamanho;


public class TestarEndereco {
    public static void main(String[] args) {
        ValidarEndereco validatorEndereco = new ValidarEnderecoTamanho().setproximo(new ValidarEnderecoFormato());
        Endereco[] enderecos = new Endereco[]
        {
            new Endereco("Rua A, 123"),
            new Endereco("Rua B, 456, Bairro X, Cidade Y, Estado Z, País W, CEP 12345-678"),
            new Endereco("Rua C, 789, Bairro A, Cidade B, Estado C, País D, CEP 98765-'432"),
            new Endereco("Rua D, 101, Bairro E, Cidade F, Estado G, País H, CEP 54321-098, Complemento: Apt 202"),
            new Endereco("Rua E, 202, Bairro I, Cidade J, Estado K, País L, CEP 67890-123, CorValidarEnderecoTamanhoplemento: Casa 1"),
            new Endereco("Rua E, 202, Quadra 20, Quadra 01"),
            new Endereco("Rua E, 202, Qdra 20, Lot 01"),
            new Endereco(null),
            new Endereco(" "),
            new Endereco("Rua F, 303, Bairro M, Cidade N, Estado O, País P, CEP 13579-246, Complemento: Apartamento 303, Bloco A, Condomínio XYZ, Próximo ao Parque ABC, Referência: Em frente à Escola DEF, Telefone: (12) 3456-7890, E-mail: contato@ exemplo.com, Site: www.exemplo.com, Horário de Funcionamento: Segunda a Sexta, das 8h às 18h, Sábado das 9h às 13h, Domingo Fechado"),
            new Endereco("Ru E, 202, Bairr I, Cidad J, Estado K, País L, CEP 67890-123, Complemento: Casa 1"),
        };

        for(var endereco : enderecos)
        {
            System.out.println(endereco);
            try {
               validatorEndereco.validar(endereco);
               System.out.println(endereco.getEndereco() + "   ✅");
           } catch (Exception e) {
               System.out.println(endereco.getEndereco() + " : "+  e.getMessage() + "   ❌");
           }
        }
    }
}
