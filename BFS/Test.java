public class Test {

    public static void main(String[] args) {
        
        BFS b = new BFS(4); 
       
        b.addEdge(0, 1);
        b.addEdge(0, 2);
        b.addEdge(1, 2);
        b.addEdge(2, 0);
        b.addEdge(2, 3);
        b.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal (starting from vertex 2)\n");
 
        b.printBFS(2);
    }
}