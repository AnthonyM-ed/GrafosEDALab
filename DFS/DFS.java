import java.util.*;

public class DFS {

    private int V;                          //número de vertices
    private LinkedList<Integer> adj[];      //Lista de adyacencia

    public DFS(int v) {
        V = v;
        adj = new LinkedList[v];            //inicializamos con el numero de vertices
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();      //cada vertice tiene sus propias referencias
        }
    }
    
    public void addEdge(int v, int w) {     //añadimos una conexión en el grafo, entre el 
        adj[v].add(w);                      //vertice v  y el vertice w
    } 
    
    public void printDFS(int v) {           //imprimir el grafo desde un nodo v
        boolean visited[] = new boolean[V]; 
        printDFS(v, visited);               //imprimirá de forma recursiva
    }
    
    private void printDFS(int v, boolean visited[]) { //metodo auxiliar
        
        visited[v] = true;                            //ya que está siendo analizado, se cambia a visitado
        System.out.print(v + " ");                    //y se imprime
        
        Iterator<Integer> i = adj[v].listIterator();  //Iterador para recorrer la lista en varias direcciones
        
        while (i.hasNext()) {                         //Si el siguiente elemento existe
            int n = i.next();                         //ya que ya ha sido imprimido, pasamos a siguiente
            
            if (!visited[n]) {                        //Si no ha sido visitado
                printDFS(n, visited);                 //usamos recursividad para imprimir este
            }
        }
    }
}