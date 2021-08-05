public class Vertex<E> {

    protected E data;
    protected ListLinked<Edge<E>> listAdj;

    public Vertex(E data) {
        this.data = data;
        listAdj = new ListLinked<>();
    }

    public boolean equals(Object o) {
        if (o instanceof Vertex<?>) {
            Vertex<E> v = (Vertex<E>) o;
            return this.data.equals(v.data);
        }
        return false;
    }

    @Override
    public String toString() {
        return this.data + " --> " + this.listAdj.toString() + "\n";
    }
}