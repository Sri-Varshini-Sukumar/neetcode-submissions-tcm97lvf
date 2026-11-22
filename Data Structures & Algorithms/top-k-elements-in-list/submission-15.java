class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> hmp = new HashMap<>();
        List<Integer>[] bucket = new List[n+1];
        int[] res = new int[k];

        for(int i=0; i<n; i++){
            hmp.put(nums[i],hmp.getOrDefault(nums[i],0)+1);
        }

        for(int i : hmp.keySet()){
            int freq = hmp.get(i);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(i);
        }

        int c = 0;
        for(int i=bucket.length-1; i>=0 && c<k; i--){
            if(bucket[i] != null){
                for(int j : bucket[i]){
                    res[c++] = j;
                    if(c == k) break;
                }
            }
        }

        return res;
    }
}
