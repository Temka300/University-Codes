# https://leetcode.com/problems/majority-element/solutions/948321/divide-and-conquer-solution-with-video-explanation
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        return self.helper(nums, 0, len(nums))[0]

    def helper(self, nums, l, r):
        if l == r - 1:
            return nums[l], 1
        mid = l + (r - l) // 2
        maj_left, extra_left = self.helper(nums, l, mid)
        maj_right, extra_right = self.helper(nums, mid, r)

        if maj_right==maj_left:
            maj = maj_left
            extra = extra_left + extra_right
        elif extra_right > extra_left:
            maj = maj_right
            extra = extra_right - extra_left
        else:
            maj = maj_left
            extra = extra_left - extra_right
        return maj, extra
    

# https://leetcode.com/problems/majority-element/solutions/3212769/169-solution-with-step-by-step-explanation

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        # initialize the count and candidate variables
        count = 0
        candidate = None
        
        # iterate through the array
        for num in nums:
            # if count is 0, update the candidate variable
            if count == 0:
                candidate = num
            # increment or decrement count based on whether the current element is the candidate
            count += (1 if num == candidate else -1)
        
        # return the candidate variable
        return candidate
