package app.tests;

import app.Item;
import app.validadores.Validar;
import app.validadores.ValidarFormatoItem;
import app.validadores.ValidarTamanhoNomeItem;

public class TestarItem {
    public static void main(String[] args) {
        Item[] itens = new Item[]{
            new Item("Carro"),
            new Item("Bola"),
            new Item("Cavalo"),
            new Item("Cavalo de combate alemao"),
            new Item(null),
            new Item(""),
            new Item("%$¨&*keyude(90"),
            new Item("99999999"),
            new Item("llllllll"),
            new Item(" Cav")
        };
        Validar<Item> validarItem = 
            new ValidarTamanhoNomeItem()
            .setproximo(new ValidarFormatoItem());
        for(var item : itens)
        {
            try {
                validarItem.validar(item);
                System.out.println(item.getName() +  " ✅");
            } catch (Exception e) {
                System.out.println(item.getName() +  " ❌ " + e.getMessage());
            }
        }
    }
}
