package graph;

import java.util.ArrayList;

public class GetEdge {

//    Write a function based on the specifications above, which takes in a graph,
//    and an array of city names.
    public Output isFullTripPossible(graph2 graph, Vertex[] arrayOfCities) {

        Output output = new Output(false, 0);
        ArrayList<Edge> allNeighbors;

        for (int i = 0; i < arrayOfCities.length; i++) {
            allNeighbors = graph.getNeighbors(arrayOfCities[i]);

            //If the next city is not the neighboring cities, then it is not possible to fly
            if(i + 1 < arrayOfCities.length && allNeighbors.contains(arrayOfCities[i + 1])) {
                return new Output(false, 0);
            }

            if (i +1 < arrayOfCities.length) {
                Vertex nextValue = arrayOfCities[i + 1];

                for (Edge item : allNeighbors) {
                    if (item.vertex == nextValue) {
                        output.setPossible(true);
                        output.setValue(output.getValue() + item.weight);
                    }
                }
            }


        }

        return output;
    }
}
