class Solution {
    
    public int[] arr;
    public List<List<Integer>> adj;
    public Set<Integer> Visited;
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        arr = new int[n];
        adj = new ArrayList<>(n);
        
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] e: edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        Visited = new HashSet<>(n);
        
        dfs(0, labels);
        
        return arr;
    }
    
    public int[] dfs(int node, String labels){
        
        Visited.add(node);
        
        int[] count = new int[26];
        
        for(int a : adj.get(node)){
            if(!Visited.contains(a)){
                int[] adjC = dfs(a,labels);
                for(int i=0; i<26; i++){
                    count[i] += adjC[i];
                }
            }
        }
        
        char ch = labels.charAt(node);
        
        count[ch - 'a']++;
        arr[node] = count[ch - 'a'];
        return count;
    }
}