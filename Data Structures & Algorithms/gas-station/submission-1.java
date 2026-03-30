class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;

        int totalGas = 0;
        int totalCost = 0;

        for(int i=0; i<n; i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if(totalGas < totalCost) return -1;
        int startIndex = 0;
        int currsum = 0;
        for(int i=0; i<n; i++){
            currsum += gas[i] - cost[i];
            if(currsum < 0){
                startIndex = i+1;
                currsum = 0;
            }
        }
        return startIndex;
    }
}
