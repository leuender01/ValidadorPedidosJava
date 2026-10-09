package app.tests;

import app.Cliente;
import app.execoes.FormatoCpfInvalido;
import app.execoes.FormatoInvalido;
import app.execoes.IdadeInvalida;
import app.execoes.NomeGrande;
import app.execoes.NomePequeno;
import app.execoes.TamanhoCpfInvalido;
import app.validadores.ValidarCliente;
import app.validadores.ValidarFormatoCpfCliente;
import app.validadores.ValidarFormatoNomeCliente;
import app.validadores.ValidarIdadeCLiente;
import app.validadores.ValidarTamanhoCpfCliente;
import app.validadores.ValidarTamanhoNomeCliente;

public class TestarCliente {
   public static void main(String[] args) {
       ValidarCliente validarCliente = new ValidarTamanhoNomeCliente()
           .setproximo(new ValidarFormatoNomeCliente()
                   .setproximo(new ValidarTamanhoCpfCliente()
                       .setproximo(new ValidarFormatoCpfCliente()
                           .setproximo(new ValidarIdadeCLiente()
                               )
                           )
                       )
                   );
       Cliente[] clientes = new Cliente[]{
           new Cliente( null, null, 0),
           new Cliente( null, null, 0),
           new Cliente( "Leu", null, 0),
           new Cliente( "Leuender", null, 0),
           new Cliente( "Leuender", "1232343341", 0),
           new Cliente( "Leuender", "...........", 0),
           new Cliente( "Leuender", "eusoubatman", 20),
           new Cliente( "Leuender", "eusoubatma", 20),
           new Cliente( "Leuender", "11111111111", 300),
           new Cliente( "Leuender", "01291029932", 300),
           new Cliente( "Leuender", "01291029932", 55),
           new Cliente( "LLLLLLL", "01291029932", 55),
           new Cliente( "aisdfhjjksjskdksjdksjdksdj3sdjkhjdjkfjsdkjf934893903940349", "01291029932", 55),
       }; 
       for(var cliente : clientes)
       {
           try {
               validarCliente.validar(cliente);
               System.out.println(cliente + "   ✅");
           } catch (NomePequeno e) {
               System.out.println(cliente.getName() + " : "+  e.getMessage() + "   ❌");
           } catch (NomeGrande e) {
               System.out.println(cliente.getName() + " : "+  e.getMessage() + "   ❌");
           } catch (FormatoInvalido e) {
               System.out.println(cliente.getName() + " : "+  e.getMessage() + "   ❌");
           } catch (FormatoCpfInvalido e) {
               System.out.println(cliente.getCpf() + " : " +  e.getMessage() + "   ❌");
           } catch (TamanhoCpfInvalido e) {
               System.out.println(cliente.getCpf() + " : " +  e.getMessage() + "   ❌");
           } catch (IdadeInvalida e) {
               System.out.println(cliente.getIdade() + " : " +  e.getMessage() + "   ❌");
           }
       }
   }
}
