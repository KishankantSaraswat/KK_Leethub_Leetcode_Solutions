class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        maxi=0
        count=0
        for i in range(len(nums)):
            if(nums[i]==1):
                count=count+1
                maxi=max(count,maxi)

            else:
                count=0
        
        return maxi
        