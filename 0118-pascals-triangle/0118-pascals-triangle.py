class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res=[]
        arr=[[0]*numRows for _ in range(numRows)]



        for i in range(numRows):
            for j in range(i+1):
                if j==0 or j==i:
                    arr[i][j]=1
                else:
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j]

        for i in range(numRows):
            lst=[]
            for j in range(i+1):
                lst.append(arr[i][j])

            res.append(lst)
        

        return res
                    

        