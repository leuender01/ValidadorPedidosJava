package app.execoes;
public class MetodoPagamentoInvalido extends RuntimeException{
    public MetodoPagamentoInvalido()
    {
        super("Metodo de pagamento invalido");
    }
    public MetodoPagamentoInvalido(String pay)
    {
        if(pay == null) pay = "NaoDefinido";
        super("Metodo de pagamento invalido: " + pay);
    }
}

