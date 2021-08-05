public class Test {

    public static void main(String[] args) {

        DFS d = new DFS(4);

        d.addEdge(0, 1);
        d.addEdge(0, 2);
        d.addEdge(1, 2);
        d.addEdge(2, 0);
        d.addEdge(2, 3);
        d.addEdge(3, 3);
 
        System.out.println("Following is Depth First Traversal (starting from vertex 2)");
 
        d.printDFS(2);
    }
}