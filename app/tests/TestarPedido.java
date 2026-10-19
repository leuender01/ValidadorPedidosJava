package app.tests;
import java.util.ArrayList;
import java.util.List;
import app.MetodoPagamento;
import app.Cliente;
import app.Item;
import app.Endereco;
import app.Pedido;
import app.validadores.Validar;
import app.validadores.ValidarPedidoCliente;
import app.validadores.ValidarPedidoEndereco;
import app.validadores.ValidarPedidoItem;
import app.validadores.ValidarPedidoPagamento;
import app.Pagamento;

public class TestarPedido {
    public static void main(String[] args) {

        Validar<Pedido> validarPedido =
        new ValidarPedidoCliente()
        .setproximo(new ValidarPedidoEndereco()
        .setproximo(new ValidarPedidoPagamento()
        .setproximo(new ValidarPedidoItem()
        )
        )
        );
        Endereco[] enderecos = new Endereco[]
        {
            new Endereco("Rua 1, quadra 1, lot 1"),
            new Endereco("Rua 2, quadra 2, lot 2"),
            new Endereco("Rua 3, quadra 3, lot 3"),
            new Endereco("Rua 4, quadra 4, lot 4"),
            new Endereco("Rua 5, quadra 5, lot 5"),
            new Endereco("Rua 6, quadra 6, lot 6"),
            new Endereco("Rua 7, quadra 7, lot 7"),
            new Endereco("Rua 12, quadra 32, lot 42"),
            new Endereco("Rua 23, quadra 45, lot 67"),
            new Endereco("Rua 34, quadra 56, lot 78"),
            new Endereco("Rua 34, , lot 78"),
            new Endereco("LLLLL lll ll"),
            new Endereco("Rua <xxxxx> quadra <xx> lot <xxxx>"),
            new Endereco(null),
        };

        Cliente[] clientes = new Cliente[]
        {   
            new Cliente("Lauda", "01291029932", 10),
            new Cliente("$*&@*$#&", "01291029900", 30),
            new Cliente("LLLLLLL", "01291029932", 56),
            new Cliente("aisdfhjjksjskdksjdksjdksdj3sdjkhjdjkfjsdkjf934893903940349", "01291029932", 100),
            new Cliente("aisdfhjjksjskdksjdksjdksdj3sdjkhjdjkfjsdkjf934893903940349", "01291029902", 200),
            new Cliente("Leuender", "12345678909", 28),
            new Cliente("Ooooooo", "01291029900", 30),
            new Cliente("Leuender ", "01291029932", 56),
            new Cliente("Leuender Oli", "01291020932", 100),
            new Cliente("Leuender Oliveira", "01291029932", 30),
        };


        Item[] itens = new Item[]
        {
            new Item("Carro"),
            new Item("12232433445"),
            new Item("Cavalo"),
            new Item("$&#$&#"),
            new Item("xxxxxXXXxx"),
            new Item("Skate"),
            new Item("230920"),
            new Item("Bicicleta"),
        };

        Pagamento[] pagamentos = new Pagamento[]
        {
            new Pagamento(MetodoPagamento.CARTAO_DEBITO, 100),
            new Pagamento(MetodoPagamento.CARTAO_CREDITO, 200),
            new Pagamento(MetodoPagamento.BOLETO, 10),
            new Pagamento(MetodoPagamento.PIX, 10.3),
            new Pagamento(null, 0),
            new Pagamento(null, 100),
        };
        List<Pedido> pedidos = new ArrayList<Pedido>();
        
        for(int i = 0; i < 10; i++)
        {
            Pedido pedido = new Pedido(enderecos[i % enderecos.length], clientes[i % clientes.length],  pagamentos[i % pagamentos.length]);
            for(int j = 0; j < 3; j++)
            {
                pedido.addItem(itens[(i + j) % itens.length]);
            }
            pedidos.add(pedido);
        }
        for(Pedido pedido : pedidos)
        {
            try {
                validarPedido.validar(pedido);
                System.out.println("Pedido válido: " + pedido);
            } catch (Exception e) {
                System.out.println("\033[32;1m Pedido inválido: " + pedido.getCliente().getName() +" " + e.getMessage() + "\033[0m");
            }
        }
    }
}
