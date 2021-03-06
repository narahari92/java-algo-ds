package com.techstuff.algods.graphs.mst;

import java.util.List;

import org.junit.Test;

import com.techstuff.algods.graphs.ComparableVertex;
import com.techstuff.algods.graphs.Edge;
import com.techstuff.algods.graphs.Vertex;
import com.techstuff.algods.graphs.WeightedGraph;

public class PrimTest {

	@Test
	public void testOperation() {
		WeightedGraph<Double, Character> graph = constructWeightedGraph();
		Prim<Character> prim = new Prim<>(graph);
		List<Edge<Double, Character>> mst = prim.mst();
		for(Edge<Double, Character> edge : mst) {
			System.out.println(edge.getSource().getPayload() + "--" + edge.getAttributes() + "--" + edge.getDestination().getPayload());
		}
		/**
		 * Edges in above for loop should display as below
		 *  a--4--b
			a--8--h
			h--1--g
			g--2--f
			f--4--c
			c--2--i
			c--7--d
			d--9--e
		 */
	}
	
	private WeightedGraph<Double, Character> constructWeightedGraph() {
		WeightedGraph<Double, Character> graph = new WeightedGraph<>();
		ComparableVertex<Character> node1 = new ComparableVertex<Character>('a');
		ComparableVertex<Character> node2 = new ComparableVertex<Character>('b');
		ComparableVertex<Character> node3 = new ComparableVertex<Character>('c');
		ComparableVertex<Character> node4 = new ComparableVertex<Character>('d');
		ComparableVertex<Character> node5 = new ComparableVertex<Character>('e');
		ComparableVertex<Character> node6 = new ComparableVertex<Character>('f');
		ComparableVertex<Character> node7 = new ComparableVertex<Character>('g');
		ComparableVertex<Character> node8 = new ComparableVertex<Character>('h');
		ComparableVertex<Character> node9 = new ComparableVertex<Character>('i');
		graph.addEdge(node1, node2, 4.0);
		graph.addEdge(node2, node3, 8.0);
		graph.addEdge(node3, node4, 7.0);
		graph.addEdge(node4, node5, 9.0);
		graph.addEdge(node5, node6, 10.0);
		graph.addEdge(node6, node7, 2.0);
		graph.addEdge(node7, node8, 1.0);
		graph.addEdge(node8, node1, 8.0);
		graph.addEdge(node8, node9, 7.0);
		graph.addEdge(node7, node9, 6.0);
		graph.addEdge(node3, node9, 2.0);
		graph.addEdge(node3, node6, 4.0);
		graph.addEdge(node4, node6, 14.0);
		graph.addEdge(node2, node8, 11.0);
		return graph;
	}
}
