class Solution {
    public boolean validTree(int n, int[][] edges) {
        if (edges.length > n -1){
            return false;
        }

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++){
            map.put(i, new ArrayList<>());
        }
        for (int[] nodes : edges){
            map.get(nodes[0]).add(nodes[1]);
            map.get(nodes[1]).add(nodes[0]);
        }

        Set<Integer> visited = new HashSet<>();
        dfs(0, map, visited);
        return visited.size() == n;
    }

    private void dfs(int node, Map<Integer, List<Integer>> map, Set<Integer> visited){
        if (visited.contains(node)){
            return;
        }
        visited.add(node);

        for (int nei : map.get(node)){
            dfs(nei, map, visited);
        }
    }

}

