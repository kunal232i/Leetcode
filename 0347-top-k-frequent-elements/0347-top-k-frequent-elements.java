class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length-1;
        Map<Integer, Integer> map = new HashMap<>();
        int arr[] = new int[k];
        
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        PriorityQueue<Integer> maxheap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        
        for(int key : map.keySet()){
            maxheap.add(key);
        }
        
        for(int i=0; i<k; i++){
            arr[i] = maxheap.poll();
        }
        
        return arr;
    }
}