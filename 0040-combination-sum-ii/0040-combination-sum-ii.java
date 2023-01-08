class Solution {
    
    public void findCombinations(int[] arr, List<List<Integer>> ans, int n, int target, int ind, List<Integer> ds){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=ind; i<n; i++){
            if( i>ind && arr[i] == arr[i-1]) continue;
            if(arr[i]>target) break;

            ds.add(arr[i]);
            findCombinations(arr, ans, n, target-arr[i], i+1, ds);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        int n = candidates.length;
        findCombinations(candidates, ans, n, target, 0, new ArrayList<>());
        return ans;
    }
    
}