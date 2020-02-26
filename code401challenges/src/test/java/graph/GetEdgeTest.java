package graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetEdgeTest {
    graph2 graph = new graph2();

    Vertex v1= new Vertex("Pandora");
    Vertex v2= new Vertex("Arendelle");
    Vertex v3= new Vertex("Metroville");
    Vertex v4= new Vertex("Monstropolis");
    Vertex v5= new Vertex("Narnia");
    Vertex v6= new Vertex("Naboo");


    @Before
    public void init() {
        graph.addNode(v1);
        graph.addNode(v2);
        graph.addNode(v3);
        graph.addNode(v4);
        graph.addNode(v5);
        graph.addNode(v6);


        graph.addEdge(v1, v2, 150);
        graph.addEdge(v1, v3, 82);
        graph.addEdge(v2, v3, 99);
        graph.addEdge(v2, v4, 42);
        graph.addEdge(v3, v4, 105);
        graph.addEdge(v3, v5, 37);
        graph.addEdge(v3, v6, 26);
        graph.addEdge(v4, v6, 73);
        graph.addEdge(v5, v6, 250);
    }



    @Test
    public void test() {
        GetEdge test = new GetEdge();
        Vertex[] arrayOfCities1 = new Vertex[]{v3, v1};  // [Metroville, Pandora]
        Vertex[] arrayOfCities2 = new Vertex[]{v2, v4, v6};  // [Aredennele, Monstropolis, Naboo]
        Vertex[] arrayOfCities3 = new Vertex[]{v6, v1};  // [Naboo, Pandora]
        Vertex[] arrayOfCities4 = new Vertex[]{v5, v2, v6};  // [Narnia, Arendelle, Naboo]

        //Test to see if the flights are possible
        assertTrue("The flight should be possible", test.isFullTripPossible(graph, arrayOfCities1).isPossible);
        assertTrue("The flight should be possible", test.isFullTripPossible(graph, arrayOfCities2).isPossible);
        assertFalse("The flight should not be possible", test.isFullTripPossible(graph, arrayOfCities3).isPossible);
        assertFalse("The flight should not be possible", test.isFullTripPossible(graph, arrayOfCities4).isPossible);

        //Test to see if the cost is calculated correctly
        assertEquals("The method should return the total cost of the flight", 82,
                test.isFullTripPossible(graph, arrayOfCities1).value);
        assertEquals("The method should return the total cost of the flight", 115,
                test.isFullTripPossible(graph, arrayOfCities2).value);
        assertEquals("The method should return the total cost of the flight", 0,
                test.isFullTripPossible(graph, arrayOfCities3).value);
        assertEquals("The method should return the total cost of the flight", 0,
                test.isFullTripPossible(graph, arrayOfCities4).value);


    }


    }