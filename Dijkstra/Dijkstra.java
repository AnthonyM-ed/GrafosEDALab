public class Dijkstra {

    private int[] distance;                        //arreglo de distancias
    private boolean[] visited;                     //Dijkstra tiene una lista de vertices que pueden o no ser evaluados
    private int[][] adjacencyMatrix;
    private int V;                                 //Numero de vertices

    public Dijkstra(int v) {
        this.distance = new int[v];
        this.visited = new boolean[v];
        this.adjacencyMatrix = new int[v][v];
        this.V = v;
    }

    public void insert(int v1, int v2, int w) {      //vertice 1, vertice 2 y el peso de la arista que los une w
        adjacencyMatrix[v1][v2] = w;
        adjacencyMatrix[v2][v1] = w;
    }

    public void dijkstra() {
        int v = adjacencyMatrix.length;
        distance[0] = 0;
        for (int i = 1; i < v; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < v - 1; i++) {
            int minVertex = findMinVertex();                  //encontrar vertice con menor distancia
            visited[minVertex] = true;
            for (int j = 0; j < v; j++) {                     //Analizar adyacentes
                if (adjacencyMatrix[minVertex][j] != 0 && !visited[j] && distance[minVertex] != Integer.MAX_VALUE) {
                    int newDist = distance[minVertex] + adjacencyMatrix[minVertex][j];
                    if (newDist < distance[j]) {
                        distance[j] = newDist;
                    }
                }
            }
        }
    }

    private int findMinVertex() {
        int minVertex = -1;
        for (int i = 0; i < distance.length; i++) {
            if (!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex])) {
                minVertex = i;
            }
        }
        return minVertex;
    }

    public void printDijkstra() {
        for (int i = 0; i < V; i++) {
            System.out.println("Nodo: " + i + " - Camino minimo: " + distance[i]);
        }
    }
}