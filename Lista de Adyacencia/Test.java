public class Test {

    public static void main(String[] args) {
        GraphLink<String> g = new GraphLink<>();

        g.insertVertex("lima");
        g.insertVertex("aqp");
        g.insertVertex("cusco");
        g.insertVertex("piura");
        g.insertVertex("tarapoto");

        g.insertEdge("lima", "aqp", 10);
        g.insertEdge("cusco", "aqp", 3);
        g.insertEdge("piura", "lima", 5);
        g.insertEdge("cusco", "lima", 8);
        g.insertEdge("piura", "tarapoto", 9);
        //g.insertEdge("aqp", "lima", 120);

        System.out.println("Grafo ciudades:\n" + g);
    }
}