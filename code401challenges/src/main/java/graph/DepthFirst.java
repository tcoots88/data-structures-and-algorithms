package graph;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Stack;

public class DepthFirst {



    public ArrayList<Vertex> performDFS(graph2 graph, Vertex vertex) {
        ArrayList<Vertex> vertices = new ArrayList<>();
        ArrayList<Edge> allNeighbors;


        LinkedHashMap<Vertex, Boolean> visitedVertex = new LinkedHashMap<>();
        for(Vertex v: graph.getNodes()) {
            visitedVertex.put(v, false);
        }

        Stack<Vertex> stackOfVertices = new Stack<>();
        stackOfVertices.push(vertex);

        while (!stackOfVertices.isEmpty()) {
            vertex = stackOfVertices.peek();
            stackOfVertices.pop();
            vertices.add(vertex);

            if(!visitedVertex.get(vertex)) {
                visitedVertex.put(vertex, true);
            }

            allNeighbors = graph.getNeighbors(vertex);
            for (Edge edge: allNeighbors) {
                if(!visitedVertex.get(edge.getVertex())) {
                    stackOfVertices.push(edge.getVertex());
                }

            }
        }

        return vertices;

    }

    public String print(ArrayList<Vertex> vertexArrayList) {
        StringBuilder printString = new StringBuilder();

        for(Vertex v: vertexArrayList) {
            printString.append(v.getValue() + " ");
        }

        return printString.toString();
    }
}
