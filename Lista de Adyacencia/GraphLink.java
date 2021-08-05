public class GraphLink<E> {
    protected ListLinked<Vertex<E>> listVertex;

    public GraphLink() {
       listVertex = new ListLinked<>();
    }
    
    public void insertVertex(E data){
        Vertex<E> nuevo = new Vertex<E>(data);
        
        if(this.listVertex.search(nuevo)!= null){
            System.out.println("Vertice ya fue insertado anteriormente");
            return;
        }
        this.listVertex.insertFirst(nuevo);
    }
    
    public void insertEdge(E verOri, E verDes){//no ponderado
        this.insertEdge(verOri, verDes,-1);
    }
    
    public void insertEdge(E verOri, E verDes, int weight){//ponderado
        Vertex<E> refOri = this.listVertex.search(new Vertex<E>(verOri));
        Vertex<E> refDes = this.listVertex.search(new Vertex<E>(verDes));
        
        if(refOri == null || refDes == null){
            System.out.println("Vertice origen y/o destino no existen...");
            return;
        }
        if(refOri.listAdj.search(new Edge<E>(refDes)) != null){
            System.out.println("Arista ya fue insertada anteriormente...");
            return;
        }
        
        refOri.listAdj.insertFirst(new Edge<E>(refDes, weight));
        refDes.listAdj.insertFirst(new Edge<E>(refOri, weight));//grafo no dirigido
    }
    
    @Override
    public String toString(){
        return this.listVertex.toString();
    }
}