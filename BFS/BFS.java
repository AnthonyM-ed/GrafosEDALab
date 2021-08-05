import java.util.*;

public class BFS {

    private int V;                       //El numero de vertices
    private LinkedList<Integer> adj[];   //Lista de adyacencia

    public BFS(int v) {
        V = v;
        adj = new LinkedList[v];         //inicializamos con el numero de vertices
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();   //cada vertice tiene sus propias referencias
        }
    }

    public void addEdge(int v, int w) {  //añadimos una conexión en el grafo, entre el 
        adj[v].add(w);                   //vertice v  y el vertice w
    }

    public void printBFS(int s) {                         //imprimir el grafo empezando desde un vertice s
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[s] = true;                                //como estamos en el vertice s, se considera como visitado
        queue.add(s);                                     //añadimos el elemento una la lista enlazada auxiliar queue

        while (!queue.isEmpty()) {                        //mientras la lista no está vacia
            s = queue.poll();                             //extraemos y eliminamos el primer elemento del queue
            
            System.out.print(s + " ");                    //lo imprimimos
            
            Iterator<Integer> i = adj[s].listIterator();  //devuelve un iterador que permite recorrer una lista
                                                          //en varias direcciones (hacia adelante o atras)
                                                          
            while (i.hasNext()) {                         //mientras el siguiente de la lista no sea nulo
                int n = i.next();
                if (!visited[n]) {                        //si no ha sido visitado
                    visited[n] = true;                    //se le cambia a visitado
                    queue.add(n);                         //y lo añadimos a la lista auxiliar
                }
            }
        }
    }
}