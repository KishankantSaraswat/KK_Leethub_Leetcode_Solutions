class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        lst=[0]*len(nums)

        for i in range(0,len(nums)):
            lst[(k+i)%len(nums)]=nums[i]
        
        for i in range(0, len(nums)):
            nums[i]=lst[i]