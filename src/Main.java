import itens.LinkedList;
import itens.Node;
import itens.Sites;

public class Main {
    public static void main(String[] args) {
    LinkedList lista = new LinkedList();
    Sites s = new Sites("mozila","https://www.mozila.com");
    Sites n = new Sites("google","https://www.google.com");
    lista.add(s);
    lista.add(n);

        System.out.println(lista.findLinks("google"));

    }
}
