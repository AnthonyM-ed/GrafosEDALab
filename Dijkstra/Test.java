public class Test {

    public static void main(String[] args) {
        
        Dijkstra d = new Dijkstra(5);
  
        d.insert(0, 1, 4);
        d.insert(0, 2, 8);
        d.insert(1, 2, 2);
        d.insert(1, 3, 5);
        d.insert(2, 3, 5);
        d.insert(2, 4, 9);
        d.insert(3, 4, 4);
        
        d.dijkstra();
        
        d.printDijkstra();
    }
}