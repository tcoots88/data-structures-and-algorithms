package graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class graph2Test {

    graph2 graphTest = new graph2();

    Vertex vertexTester1 = new Vertex(1);
    Vertex vertexTester2 = new Vertex(2);
    Vertex vertexTester3 = new Vertex(3);
    Vertex vertexTester4 = new Vertex(4);

    @Before
    public void init() {
        graphTest.addNode(vertexTester1);
        graphTest.addNode(vertexTester2);
        graphTest.addNode(vertexTester3);
        graphTest.addNode(vertexTester4);
    }

    @Test
    public void testForAddNodeAndGetNodes(){
        Vertex vertexTester5 = new Vertex(5);
        graphTest.addNode(vertexTester5);
        assertTrue("The graph should contain the vertex that has been added",
                graphTest.getNodes().contains(vertexTester5));
    }

    @Test
    public void addEdgeTest(){
        graphTest.addEdge(vertexTester1, vertexTester2, 2);
        graphTest.addEdge(vertexTester2, vertexTester3, 9);
        graphTest.addEdge(vertexTester3, vertexTester4, 6);
        graphTest.addEdge(vertexTester4, vertexTester1, 7);

        assertNotNull(graphTest.print());
    }


    @Test
    public void getSizeTest() {
        assertEquals("The method should return the size of the graph (number of nodes)",
                4, graphTest.size());
    }

    @Test
    public void getWrongSizeTest() {
        assertNotEquals("The method should return the size of the graph (number of " +
                        "nodes)",
                9, graphTest.size());
    }





}