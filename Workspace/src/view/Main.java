package view;
import model.*;


public class Main {

    public static void main(String[] args) {
        Peca peao = new Peao();
        Peca cavalo = new Cavalo();
        Peca bispo = new Bispo();

        peao.movimento();
        cavalo.movimento();
        bispo.movimento();

        System.out.println(peao instanceof Peca);
        System.out.println(cavalo instanceof Peca);
        System.out.println(bispo instanceof Peca);

    }
}
