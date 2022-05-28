package aplicativo;

import dominio.Pessoa;

public class Programa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1,"Pedro", "pedro3barossi@gmail.com");
        Pessoa p2 = new Pessoa(2,"Mustafa", "mumurawr@gmail.com");
        Pessoa p3 = new Pessoa(3,"Jessie", "musashi@rgan.net");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
