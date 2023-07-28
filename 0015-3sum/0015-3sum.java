class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length-1;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i=0; i<=n; i++){
            int front = i+1;
            int back = n;
            
            while(front<back){
                int sum = nums[i] + nums[front] + nums[back];
                List<Integer> list = new ArrayList<>();
                
                if(sum > 0){
                    back--;   
                }else if(sum < 0){
                    front++;
                }else{
                    list.add(nums[i]);
                    list.add(nums[front]);
                    list.add(nums[back]);
                    res.add(list); 
                    
                    //check duplicate and then increse front & back
                    while(front<back && nums[front] == list.get(1))front++;
                    while(front<back && nums[back] == list.get(2))back--;
                }
            }
            
            //check duplicate & then increase i
            while(i+1<=n && nums[i]==nums[i+1])i++;
        }
        return res;
    }
}