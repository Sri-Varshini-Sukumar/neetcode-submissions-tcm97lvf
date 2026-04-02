class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;

        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));

        ArrayList<int[]> lst = new ArrayList<>();
        int last_start = intervals[0][0];
        int last_end = intervals[0][1];

        for(int i=1; i<n; i++){
            if(intervals[i][0] <= last_end){
                last_end = Math.max(last_end,intervals[i][1]);
            }else{
                lst.add(new int[]{last_start,last_end});
                last_start = intervals[i][0];
                last_end = intervals[i][1];
            }
        }
        lst.add(new int[]{last_start,last_end});
        int[][] res = new int[lst.size()][2];
        for(int i=0; i<lst.size(); i++){
            res[i] = lst.get(i);
        }
        return res;
    }
}
