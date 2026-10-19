package app.tests;
import app.Pagamento;
import app.validadores.Validar;
import app.validadores.ValidarMetodoPagamento;
import app.validadores.ValidarValorPagamento;
import app.MetodoPagamento;

public class TestarPagamento {
    public static void main(String[] args) {
        Pagamento[] pagamentos = new Pagamento[]{
            new Pagamento(MetodoPagamento.PIX, 100.0),
            new Pagamento(MetodoPagamento.CARTAO_CREDITO, 200.0),
            new Pagamento(MetodoPagamento.CARTAO_DEBITO, 300.0),
            new Pagamento(MetodoPagamento.BOLETO, 400.0),
            new Pagamento(null, 1.0),
            new Pagamento(null, 29.0)
        };
        Validar<Pagamento> validarPagamento =
            new ValidarMetodoPagamento()
            .setProximo(new ValidarValorPagamento());
        for(var pagamento : pagamentos)
        {
            try {
                validarPagamento.validar(pagamento);
                System.out.println(pagamento +  " ✅");
            } catch (Exception e) {
                System.out.println(pagamento +  " ❌ " + e.getMessage());
            }
        }
    }
}
