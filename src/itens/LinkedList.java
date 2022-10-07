package itens;

public class LinkedList {
    private Node head;
    private Node tail;
    private int tamanho;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }


    public void add(Sites s){
        Node no = new Node(s);
        if (this.head==null && this.tail==null){
            this.head = no;
            this.tail = no;
        }else {
            this.tail.setNext(no);
            this.tail = no;
        }
        this.tamanho++;
    }
    public String findLinks(Sites nome){
        Node no = new Node(nome);
        while (no!=null){
            if ()
        }

    }

}
