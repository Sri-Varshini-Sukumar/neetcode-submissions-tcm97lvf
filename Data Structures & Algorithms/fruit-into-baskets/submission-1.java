class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> hmp = new HashMap<>();
        int max = 0;
        int l = 0;
        for(int r=0; r<fruits.length; r++){
            hmp.put(fruits[r],hmp.getOrDefault(fruits[r],0)+1);
            while(hmp.size() > 2){
                hmp.put(fruits[l],hmp.get(fruits[l])-1);
                if(hmp.get(fruits[l]) == 0) {
                    hmp.remove(fruits[l]);
                }
                l++;
            }
            max = Math.max(max,r-l+1);
        }

        return max;
    }
}