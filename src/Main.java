import itens.LinkedList;
import itens.Node;
import itens.Sites;

public class Main {
    public static void main(String[] args) {
    LinkedList lista = new LinkedList();
    Sites s = new Sites("mozila","www.mozila.com");
    Sites n = new Sites("dasdas","dasdasd");
    s.setSiteNames("ronaldo");
    lista.add(s);
    lista.add(n);
        System.out.println(lista.getTail().getNode().getSiteNames());
    }
}
