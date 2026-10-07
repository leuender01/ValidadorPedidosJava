package app.execoes;

public class IdadeInvalida extends RuntimeException
{
    public IdadeInvalida(int idade)
    {
        String message;
        if(idade < 18)
        {
            message = "Menor de idade nao pode: " + idade;
        }else{
            message = "IdadeInvalida: " + idade;
        }
        super(message);
    }
}
