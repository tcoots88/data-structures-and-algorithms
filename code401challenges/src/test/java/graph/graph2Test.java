package graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class graph2Test {

    graph2 graphTest = new graph2();

    Vertex vertexTester1 = new Vertex('A');
    Vertex vertexTester2 = new Vertex('B');
    Vertex vertexTester3 = new Vertex('C');
    Vertex vertexTester4 = new Vertex('D');
    Vertex vertexTester5 = new Vertex('E');
    Vertex vertexTester6 = new Vertex('F');


    @Before
    public void init() {
        graphTest.addNode(vertexTester1);
        graphTest.addNode(vertexTester2);
        graphTest.addNode(vertexTester3);
        graphTest.addNode(vertexTester4);
        graphTest.addNode(vertexTester5);
        graphTest.addNode(vertexTester6);

        graphTest.addEdge(vertexTester1, vertexTester2, 2);
        graphTest.addEdge(vertexTester1, vertexTester3, 5);
        graphTest.addEdge(vertexTester1, vertexTester4, 6);
        graphTest.addEdge(vertexTester3, vertexTester5, 1);
        graphTest.addEdge(vertexTester3, vertexTester6, 2);
    }

    @Test
    public void testForAddNodeAndGetNodes(){
        Vertex vertexTester7 = new Vertex(7);
        graphTest.addNode(vertexTester7);
        assertTrue("The graph should contain the vertex that has been added",
                graphTest.getNodes().contains(vertexTester7));
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
                6, graphTest.size());
    }

    @Test
    public void getWrongSizeTest() {
        assertNotEquals("The method should return the size of the graph (number of " +
                        "nodes)",
                9, graphTest.size());
    }


    @Test
    public void testForBFS(){
        BreadthFirst bfsTester = new BreadthFirst();

        assertEquals("should return a bfs-based output", "A B C D E F ",
                bfsTester.stringBuilder(bfsTester.runBreadthFirst(graphTest, vertexTester1)));
        assertEquals("should return a bfs-based output", "C E F ",
                bfsTester.stringBuilder(bfsTester.runBreadthFirst(graphTest,
                        vertexTester3)));
        assertEquals("should return a bfs-based output", "B ",
                bfsTester.stringBuilder(bfsTester.runBreadthFirst(graphTest,
                        vertexTester2)));
        assertEquals("should return a bfs-based output", "D ",
                bfsTester.stringBuilder(bfsTester.runBreadthFirst(graphTest,
                        vertexTester4)));
        assertEquals("should return a bfs-based output", "E ",
                bfsTester.stringBuilder(bfsTester.runBreadthFirst(graphTest,
                        vertexTester5)));
        assertEquals("should return a bfs-based output", "F ",
                bfsTester.stringBuilder(bfsTester.runBreadthFirst(graphTest,
                        vertexTester6)));

    }




}