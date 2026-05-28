class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n ; i++){
            list.add(new ArrayList<>());
        }

        for (int[] nei : edges){
            list.get(nei[1]).add(nei[0]);
            list.get(nei[0]).add(nei[1]);
        }
        int res = 0;
        for (int node = 0; node < n; node++){
            if (!visited[node]){
                dfs(list, visited, node);
                res++;
            }
        }

        return res;
    }

    private void dfs(List<List<Integer>> list, boolean[] visited, int node){
        visited[node] = true;
        for (int nei : list.get(node) ){
            if (!visited[nei]){
                dfs(list,visited, nei);
            }
        }
    }
}
