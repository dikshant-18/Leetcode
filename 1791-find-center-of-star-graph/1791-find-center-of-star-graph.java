class Solution {
    /**
     * Finds the center node of a star graph.
     * In a star graph, the center node is connected to all other nodes.
     * Since we have n-1 edges for n nodes, the center must appear in every edge.
     * Therefore, checking just the first two edges is sufficient.
     * 
     * @param edges Array of edges where each edge is represented as [u, v]
     * @return The center node of the star graph
     */
    public int findCenter(int[][] edges) {
        int firstEdgeNode1 = edges[0][0];
        int firstEdgeNode2 = edges[0][1];

        int secondEdgeNode1 = edges[1][0];
        int secondEdgeNode2 = edges[1][1];
      
        if (firstEdgeNode1 == secondEdgeNode1 || firstEdgeNode1 == secondEdgeNode2) {
            return firstEdgeNode1;
        }
        return firstEdgeNode2;
    }
}