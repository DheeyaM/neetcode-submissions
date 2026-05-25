class Solution {
    private Map<Integer, List<Integer>> map = new HashMap<>();
    private Set<Integer> visited = new HashSet<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        for (int i = 0; i < numCourses; i++){
            map.put(i, new ArrayList<>());
        }

        for (int[] pre : prerequisites){
            map.get(pre[0]).add(pre[1]);
        }

        for (int c = 0; c < numCourses; c++){
            if (!dfs(c)){
                return false;
            }
        }
         return true;
    }

    private boolean dfs(int crs){
        if (visited.contains(crs)){
            return false;
        }

        if (map.get(crs).isEmpty()){
            return true;
        }

        visited.add(crs);
        for (int pre : map.get(crs)){
            if (!dfs(pre)){
                return false;
            }
        }
        visited.remove(crs);

        map.put(crs, new ArrayList<>());
        return true;
    }
}
