package itens;

public class LinkedList {
    private Node head;
    private Node tail;
    private int tamanho;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.tamanho = 0;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void add(Sites element ) {
        Node no = new Node(element);
        if (this.head == null && this.tail == null) {
            this.head = no;
            this.tail = no;
        } else {
            this.tail.setNext(no);
            this.tail = no;
        }
        this.tamanho++;
    }

    public void add() {
    }
}
 /*   public String findLinks(Sites nome){
        Node no = new Node(nome);
        while (no!=null){
            if ()
        }

    }
*/


