package app.tests;

import app.Cliente;
import app.excecoes.CpfInvalido;
import app.excecoes.FormatoCpfInvalido;
import app.excecoes.FormatoInvalido;
import app.excecoes.IdadeInvalida;
import app.excecoes.NomeGrande;
import app.excecoes.NomePequeno;
import app.excecoes.TamanhoCpfInvalido;
import app.validadores.ValidarFormatoCpfCliente;
import app.validadores.ValidarFormatoNomeCliente;
import app.validadores.ValidarIdadeCliente;
import app.validadores.ValidarTamanhoCpfCliente;
import app.validadores.ValidarTamanhoNomeCliente;
import app.validadores.Validar;
import app.validadores.ValidarCpfValido;

public class TestarCliente {
   public static void main(String[] args) {
       Validar<Cliente> validarCliente = new ValidarTamanhoNomeCliente()
           .setProximo( new ValidarFormatoNomeCliente()
                   .setProximo(new ValidarTamanhoCpfCliente()
                       .setProximo(new  ValidarFormatoCpfCliente()
                           .setProximo(new ValidarCpfValido()
                               .setProximo(new ValidarIdadeCliente()
                                   )
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
           new Cliente( "Leuender", "01291029900", 55),
           new Cliente( "LLLLLLL", "01291029932", 55),
           new Cliente( "aisdfhjjksjskdksjdksjdksdj3sdjkhjdjkfjsdkjf934893903940349", "01291029932", 55),
           new Cliente( "aisdfhjjksjskdksjdksjdksdj3sdjkhjdjkfjsdkjf934893903940349", "01291029902", 55),
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
           } catch (CpfInvalido e) {
               System.out.println(cliente.getCpf() + " : " +  e.getMessage() + "   ❌");
           }
       }
   }
}
