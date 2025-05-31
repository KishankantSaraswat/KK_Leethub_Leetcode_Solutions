class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int [] leftMax=new int[n];
        int [] rightMax=new int[n];
        int maxleft=0;
        int maxright=0;

        for(int i=0;i<n;i++){
            
            maxleft=Math.max(maxleft,height[i]);
            leftMax[i]=maxleft;
        }   

        for(int i=n-1;i>0;i--){
            
            maxright= Math.max(maxright,height[i]);
            rightMax[i]=maxright;
        }

        int ans=0;
        for(int i=0;i<n;i++){
            int minheight=Math.min(leftMax[i],rightMax[i]);
            if(minheight>height[i]){
                ans+=minheight-height[i];
            }
        }
        return ans;
    }
}