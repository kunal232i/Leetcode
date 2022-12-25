class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        long tar = target;
        if(nums == null || nums.length == 0){
            return res;
        }
        
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                long target2 = tar - nums[j] - nums[i];
                int left = j+1;
                int right = nums.length-1;
                while(left < right){
                    long tSum = nums[left] + nums[right];
                    
                    if(tSum < target2){
                        left++;
                    }else if(tSum > target2){
                        right--;
                    }else{
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[left]);
                        quad.add(nums[right]);
                        res.add(quad);
                        
                        //Duplicate handling
                        while(left < right && nums[left] == quad.get(2))++left;
                        while(left < right && nums[right] == quad.get(3))--right;
                    }
                    
                    
                }
                while((j+1)<nums.length && nums[j+1] == nums[j])++j;
            }
            while((i+1)<nums.length && nums[i+1] == nums[i])++i;
        }
        return res;
    }
}



/*
    4 sum
    unique quards
    target

    [1,0,-1,0,-2,2]
    target = 0

    rec

     1 , 0, -1, 0, -2, 2

    target = 0

    -2 -1 0 0 1 2 
     i  j l     r


    -3

    best
    sort
    loop 
    i j and k
    binary search on right half of the array
    n^3logn + nlogn

    optimal

    edge cases

    sort

    loop all i and j

    binary search on l and r

    else add to quad and quad to res

    remove duplicate then jump
    while front same ++f
    while back same --b

    while nums of j+1 == j  j++

    same of i

    TC : n^3
    Space ; 1

*/