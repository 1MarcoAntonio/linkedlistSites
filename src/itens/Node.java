package itens;

public class Node {
    private Sites node;
    private Node next;

    public Node(Sites s) {
        this.node = s;
    }

    public Sites getNode() {
        return node;
    }

    public void setNode(Sites s) {
        this.node = s;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

