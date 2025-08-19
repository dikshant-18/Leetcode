class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        
        // Build the graph
        for (int i = 0; i < equations.size(); i++) {
            List<String> eq = equations.get(i);
            String a = eq.get(0), b = eq.get(1);
            double k = values[i];
            graph.putIfAbsent(a, new HashMap<>());
            graph.putIfAbsent(b, new HashMap<>());
            graph.get(a).put(b, k);
            graph.get(b).put(a, 1.0 / k);
        }
        
        double[] res = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            List<String> query = queries.get(i);
            String start = query.get(0), end = query.get(1);
            Set<String> visited = new HashSet<>();
            res[i] = dfs(graph, start, end, 1.0, visited);
        }
        return res;
    }
    
    private double dfs(Map<String, Map<String, Double>> graph, String curr, String end, double acc, Set<String> visited) {
        if (!graph.containsKey(curr) || !graph.containsKey(end)) return -1.0;
        if (curr.equals(end)) return acc;
        visited.add(curr);
        for (Map.Entry<String, Double> nbr : graph.get(curr).entrySet()) {
            if (!visited.contains(nbr.getKey())) {
                double ans = dfs(graph, nbr.getKey(), end, acc * nbr.getValue(), visited);
                if (ans != -1.0) return ans;
            }
        }
        return -1.0;
    }
}
