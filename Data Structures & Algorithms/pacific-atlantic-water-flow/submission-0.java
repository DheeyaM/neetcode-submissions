class Solution {
    private int[][] directions = {{1,0},{-1,0}, {0,1},{0,-1}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int COL = heights[0].length;
        int ROW = heights.length;
        boolean[][] pac = new boolean[ROW][COL];
        boolean[][] atl = new boolean[ROW][COL];

        for (int c = 0; c < COL; c++){
            dfs(0, c, pac, heights);
            dfs(ROW - 1, c , atl, heights);
        }
        for (int r = 0; r < ROW; r++){
            dfs(r, 0, pac, heights);
            dfs(r, COL - 1 , atl, heights);
        }

        List<List<Integer>> res = new ArrayList<>();
        for (int r = 0; r < ROW; r++){
            for (int c = 0; c <COL; c++){
                if (atl[r][c] && pac[r][c]){
                    res.add(Arrays.asList(r,c));
                }
            }
        }
        return res;
        
    }

    public void dfs(int r, int c, boolean[][] ocean, int[][] heights){
        ocean[r][c] = true;
         for (int[] d : directions){
            int nr = r + d[0];
            int nc = c + d[1];

            if (nr >= 0 && nr < heights.length && nc >= 0 && nc < heights[0].length 
            && !ocean[nr][nc] && heights[nr][nc] >= heights[r][c] ){
                dfs(nr, nc, ocean, heights);
            }
         }
    }
}
