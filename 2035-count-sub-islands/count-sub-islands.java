class Solution {
    int m; //num of rows
    int n; //num of cols

    boolean isSubIsland; //track the current island in grid2

    //dfs to explore the island in grid2
        public void dfs(int[][] grid1, int[][] grid2, int i, int j) {
            //if curr pos out of bounds or visited already
            if (i < 0 || i == m || j < 0 || j == n || grid2[i][j] == 0) 
                return;

            //if curr cell in grid2 is land bot not in grid1, not sub-island
            if (grid1[i][j] != grid2[i][j]) {
                isSubIsland = false;
            }

            //mark the curr cell as visited
            grid2[i][j] = 0;

            //continue dfs in all 4 dir
            dfs(grid1, grid2, i + 1, j);
            dfs(grid1, grid2, i, j + 1);
            dfs(grid1, grid2, i - 1, j);
            dfs(grid1, grid2, i, j - 1);
        }

    public int countSubIslands(int[][] grid1, int[][] grid2) {
            m = grid1.length;
            n = grid1[0].length;

            int subIslandCount = 0;

            //iterate through each cell in grid2
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid2[i][j] == 1) {
                        isSubIsland = true;
                        dfs(grid1, grid2, i, j);

                        if (isSubIsland) {
                            subIslandCount++;
                        }
                    }
                }
            }

            return subIslandCount;
    }
}