package graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DepthFirstTest {
    graph2 graph = new graph2();

    Vertex v1= new Vertex('A');
    Vertex v2= new Vertex('B');
    Vertex v3= new Vertex('C');
    Vertex v4= new Vertex('D');
    Vertex v5= new Vertex('E');
    Vertex v6= new Vertex('F');



    @Before
    public void init() {
        graph.addNode(v1);
        graph.addNode(v2);
        graph.addNode(v3);
        graph.addNode(v4);
        graph.addNode(v5);
        graph.addNode(v6);

        graph.addEdgeDFS(v1, v2, 2);
        graph.addEdgeDFS(v1, v3, 5);
        graph.addEdgeDFS(v1, v4, 6);
        graph.addEdgeDFS(v3, v5, 1);
        graph.addEdgeDFS(v3, v6, 2);

    }

    @Test
    public void test() {

        DepthFirst dfs = new DepthFirst();

        assertEquals("The method should return output based on DFS",
                "A D C F E B ", dfs.print(dfs.performDFS(graph, v1)));
        assertEquals("The method should return output based on DFS",
                "C F E ", dfs.print(dfs.performDFS(graph, v3)));
        assertEquals("The method should return output based on DFS",
                "B ", dfs.print(dfs.performDFS(graph, v2)));
        assertEquals("The method should return output based on DFS",
                "D ", dfs.print(dfs.performDFS(graph, v4)));
        assertEquals("The method should return output based on DFS",
                "E ", dfs.print(dfs.performDFS(graph, v5)));
        assertEquals("The method should return output based on DFS",
                "F ", dfs.print(dfs.performDFS(graph, v6)));

    }


}