class TimeStampedValue{
    public int timestamp;
    public String value;

    public TimeStampedValue(int timestamp, String value){
        this.timestamp = timestamp;
        this.value = value;
    }
}

class TimeMap {
    Map<String,ArrayList<TimeStampedValue>> hmp;
    public TimeMap() {
        hmp = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!hmp.containsKey(key)){
            hmp.put(key,new ArrayList<>());
        }
        ArrayList<TimeStampedValue> lst = hmp.get(key);
        lst.add(new TimeStampedValue(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        if(!hmp.containsKey(key)) return "";

        ArrayList<TimeStampedValue> lst = hmp.get(key);
        Optional<TimeStampedValue> timeStamp = binarySearch(lst,timestamp);
        if(timeStamp.isEmpty()) return "";

        return timeStamp.get().value;
    }

    private Optional<TimeStampedValue> binarySearch(ArrayList<TimeStampedValue> lst,
     int target){
        int left = 0;
        int right = lst.size()-1;
        int matchIndex = -1;
        while(left <= right){
            int mid = left + (right-left)/2;
            TimeStampedValue curr = lst.get(mid);
            if(curr.timestamp <= target){
                matchIndex = mid;
                left = mid+1;
            }else{
                right = mid-1;
            }
        } 
        if(matchIndex == -1) return Optional.empty();

        return Optional.of(lst.get(matchIndex));
     }
}
