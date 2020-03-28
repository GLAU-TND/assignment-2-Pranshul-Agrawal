package problem4;

public class Element<T> {
    private T node;
    private T preOrderSuccessor;
    private Element next;
    public Element(T node, T preOrderSuccessor) {
        this.node = node;
        this.preOrderSuccessor = preOrderSuccessor;
    }
    public T getNode() {
        return node;
    }

}
