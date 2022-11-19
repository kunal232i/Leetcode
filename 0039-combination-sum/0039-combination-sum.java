class Solution {
    public void findCombination(int index, int arr[], int target, List<List<Integer>> ans, List<Integer> list){
        
        //TC- O(2^t + k) -> Exponential
        //base case
        if(index == arr.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        
        //pick
        if(arr[index]<=target){
            list.add(arr[index]);
            findCombination(index,arr,target-arr[index],ans,list);
            list.remove(list.size()-1);
        }
        //not pick
        findCombination(index+1,arr,target,ans,list);
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}