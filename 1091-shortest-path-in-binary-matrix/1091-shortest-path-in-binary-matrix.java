class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        
        // Check if the top-left or bottom-right cells are obstacles
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1)
            return -1;
        
        // Define the 8 possible directions
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
        
        // Initialize the queue and visited array
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        
        // Start from the top-left cell
        queue.offer(new int[]{0, 0});
        visited[0][0] = true;
        int pathLength = 1;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            // Process all cells in the current level
            while (size-- > 0) {
                int[] curr = queue.poll();
                
                // Check if reached the bottom-right cell
                if (curr[0] == n - 1 && curr[1] == n - 1)
                    return pathLength;
                
                // Explore the 8 directions
                for (int[] dir : directions) {
                    int newRow = curr[0] + dir[0];
                    int newCol = curr[1] + dir[1];
                    
                    // Check if the new cell is within the grid and not visited
                    if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && !visited[newRow][newCol] && grid[newRow][newCol] == 0) {
                        queue.offer(new int[]{newRow, newCol});
                        visited[newRow][newCol] = true;
                    }
                }
            }
            
            pathLength++; // Increment path length after processing each level
        }
        
        return -1; // No clear path found
    }
}
