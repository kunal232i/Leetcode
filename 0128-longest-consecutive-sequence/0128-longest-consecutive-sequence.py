class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        longest = 0
        nums_set = set(nums)
        
        for num in nums_set:
            if num - 1 not in nums_set:
                curr = num
                curr_len = 1
                
                while curr + 1 in nums_set:
                    curr += 1
                    curr_len += 1
                
                longest = max(longest, curr_len)
        return longest
        