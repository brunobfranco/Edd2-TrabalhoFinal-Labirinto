package grafosSedgewick;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph graph = new Graph(55);
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.addEdge(4, 5);
		graph.addEdge(5, 6);
		graph.addEdge(6, 7);
		graph.addEdge(7, 8);
		graph.addEdge(8, 9);
		graph.addEdge(9, 10);
		graph.addEdge(10, 11);
		graph.addEdge(11, 12);
		graph.addEdge(12, 13);
		graph.addEdge(13, 14);
		graph.addEdge(14, 15);
		graph.addEdge(15, 16);
		graph.addEdge(14, 17);
		graph.addEdge(17, 18);
		graph.addEdge(18, 19);
		graph.addEdge(19, 20);
		graph.addEdge(20, 21);
		graph.addEdge(18, 22);
		graph.addEdge(22, 23);
		graph.addEdge(9, 24);
		graph.addEdge(24, 25);
		graph.addEdge(25, 26);
		graph.addEdge(26, 27);
		graph.addEdge(27, 28);
		graph.addEdge(28, 29);
		graph.addEdge(29, 30);
		graph.addEdge(29, 31);
		graph.addEdge(31, 53);
		graph.addEdge(53, 32);
		graph.addEdge(31, 54);
		graph.addEdge(54, 33);
		graph.addEdge(33, 34);
		graph.addEdge(34, 35);
		graph.addEdge(35, 36);
		graph.addEdge(36, 37);
		graph.addEdge(36, 38);
		graph.addEdge(38, 39);
		graph.addEdge(39, 40);
		graph.addEdge(40, 41);
		graph.addEdge(41, 42);
		graph.addEdge(42, 43);
		graph.addEdge(43, 44);
		graph.addEdge(44, 45);
		graph.addEdge(45, 46);
		graph.addEdge(46, 47);
		graph.addEdge(47, 24);
		graph.addEdge(41, 48);
		graph.addEdge(48, 49);
		graph.addEdge(49, 50);
		graph.addEdge(50, 51);
		graph.addEdge(51, 52);
		graph.addEdge(50, 1);
		
		BreadthFirstPaths bfs = new BreadthFirstPaths(graph, 1);
		DepthFirstPaths dfs = new DepthFirstPaths(graph, 1);

		System.out.println("Number of Edges: " + graph.E());
		System.out.println("Number of Vertices: " + graph.V());
		System.out.println("Numero de vertices entre o inicio e o final do labirinto: " + bfs.distTo(11));
		System.out.println("Existe um caminho entre o inicio e o fim? (BFS)" + bfs.hasPathTo(11));
		System.out.println("Existe um caminho entre o inicio e o fim? (DFS)" + dfs.hasPathTo(11));
		System.out.println("BFS entre o inicio e o final do labirinto: " + bfs.pathTo(11));
		System.out.println("DFS entre o inicio e o final do labirinto: " + dfs.pathTo(11));
		
		
	}

}
