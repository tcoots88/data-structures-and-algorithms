package graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class BreadthFirst {

    public ArrayList<Vertex> runBreadthFirst(graph2 graph, Vertex vertex){
        ArrayList<Vertex> vertices = new ArrayList<>();
        ArrayList<Edge> allNeighbors;
        LinkedList<Vertex> queue = new LinkedList<>();


//        adds first node to the queue
        queue.add(vertex);

        while (!queue.isEmpty()){
            Vertex tempVertex = queue.poll();
            vertices.add(tempVertex);

            allNeighbors = graph.getNeighbors(tempVertex);
            if(!allNeighbors.isEmpty() || allNeighbors!= null){

                for(Edge item : allNeighbors){
                    queue.add(item.vertex);
                }
            }
        }
        return vertices;
    }

    public String stringBuilder(ArrayList<Vertex> vertexArrayList){
        StringBuilder stringify = new StringBuilder();

        for (Vertex v : vertexArrayList){
            stringify.append(v.getValue() + " ");
        }
        return stringify.toString();
    }
}
