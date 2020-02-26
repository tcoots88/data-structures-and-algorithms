package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// also took information from https://www.geeksforgeeks.org/graph-and-its-representations/
public class graph2 {
    HashMap<Vertex, ArrayList<Edge>> adjacencyList = new HashMap<>();
    private int size = 0;


    public graph2(){
        adjacencyList = new HashMap<Vertex, ArrayList<Edge>>();
    }

    public Vertex addNode(Vertex newVertex){
//        Adds a new node to the graph
//        Takes in the value of that node
        adjacencyList.put(newVertex, new ArrayList<Edge>());
        size++;
//        Returns the added node
        return newVertex;
    }

    public String addEdge(Vertex vertexOne, Vertex vertexTwo, int weight) {
//        Adds a new edge between two nodes in the graph
//        Include the ability to have a “weight”
//        Takes in the two nodes to be connected by the edge
//              - Both nodes should already be in the Graph
        addTwoEdges(vertexOne, vertexTwo, weight);
        addTwoEdges(vertexTwo, vertexOne, weight);
        return "Vertices added";
    }

    private void addTwoEdges(Vertex vertexOne, Vertex vertexTwo, int weight) {
        ArrayList<Edge> arrayListOfEdges = adjacencyList.get(vertexOne);
        arrayListOfEdges.add(new Edge(weight, vertexTwo));

        adjacencyList.put(vertexOne, arrayListOfEdges);
    }

    public ArrayList<Vertex> getNodes(){
//        Returns all of the nodes in the graph as a collection
        ArrayList<Vertex> arrayListOfVertices = new ArrayList<>();

        for (Map.Entry<Vertex, ArrayList<Edge>> entry : adjacencyList.entrySet()){
            arrayListOfVertices.add(entry.getKey());
        }
        return arrayListOfVertices;
    }

    public ArrayList<Edge> getNeighbors (Vertex vertexOne){
//
//        Returns a collection of nodes connected to the given node
//        Takes in a given node
//        Include the weight of the connection in the returned collection

        return adjacencyList.get(vertexOne);
    }


    public int size(){
//
//        Returns the total number of nodes in the graph
//        counter on line 9 "private int size = 0;"

        return size;
    }

    public String print() {
        StringBuilder printString = new StringBuilder();
        for (Map.Entry<Vertex, ArrayList<Edge>> entry : adjacencyList.entrySet()) {
            printString.append("Vertex: " + entry.getKey().getValue());

            for (Edge item: adjacencyList.get(entry.getKey())) {
                printString.append("-> {weight: " + item.weight + " , value: " +
                        item.vertex.value + "} ");

            }
            printString.append("\n");
        }
        return printString.toString();

    }


}
