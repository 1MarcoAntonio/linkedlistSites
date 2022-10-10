package itens;

public class Node {
    private Sites no;
    private Node next;

public Node(Sites no){
    this.no = no;
    this.next = null;
}
    public Sites getNode() {
        return no;
    }

    public void setNode(Sites element) {
        this.no = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

