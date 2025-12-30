package Chapter_25;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graphs_1 {
	
public static void dftraversal(int adjMatrix[][],int currentVertex,boolean visited[]) {
		visited[currentVertex] = true;
		System.out.print(currentVertex + " ");
		for(int i=0;i<adjMatrix.length;i++) {
			if(adjMatrix[currentVertex][i] == 1 && visited[i] == false) {
				// i is neighbor of currentVertex
				dftraversal(adjMatrix,i,visited);
			}
		}
	}
	
	public static void dftraversal(int adjMatrix[][]) {
		boolean visited[] = new boolean[adjMatrix.length];
		for(int i =0 ;i<adjMatrix.length;i++) {
			if(!visited[i]) {
				dftraversal(adjMatrix,i,visited); // O(vsquare)
				System.out.println();
			}
		}
	}
	
	public static void bfTraversal(int adjMatrix[][]) {
		Queue<Integer> pendingVertices = new LinkedList<>();
		boolean visited[] = new boolean[adjMatrix.length];
		visited[0] = true;
		pendingVertices.add(0);
		
		while(!pendingVertices.isEmpty()) {
			int currentVertex = pendingVertices.poll();
			System.out.print(currentVertex + " ");
			for(int i = 0;i<adjMatrix.length;i++) {
				if(adjMatrix[currentVertex][i] == 1 && !visited[i]) {
					// i is unvisited neighbour of currentvertex
					pendingVertices.add(i);
					visited[i] = true;
				}
			}
		}
		
	} 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int e = s.nextInt();
		int adjMatrix[][] = new int[n][n];
		for(int i=0;i<e;i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			adjMatrix[v1][v2] = 1;
			adjMatrix[v1][v2] = 1;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(adjMatrix[i][j]+" ");
			}
			System.out.println();
		}
		dftraversal(adjMatrix);
		bfTraversal(adjMatrix);
		// try has path from source to destination - dfs
		// try bfs for disconnected graph
	}

}
