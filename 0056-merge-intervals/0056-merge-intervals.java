class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==1) return intervals;

        Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));

        List<int[]>res=new ArrayList<>();

        int [] newintervals=intervals[0];
        res.add(newintervals);

        for(int [] interval: intervals){
            if(interval[0]<=newintervals[1]){
                newintervals[1]=Math.max(newintervals[1],interval[1]);
            }
            else{
                newintervals=interval;
                res.add(newintervals);
            }
        }
        return res.toArray(new int[res.size()][]);
        
    }
}