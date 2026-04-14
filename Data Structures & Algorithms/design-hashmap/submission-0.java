class MyHashMap {
    HashMap<Integer,Integer> hmp;
    public MyHashMap() {
        hmp = new HashMap<>();
    }
    
    public void put(int key, int value) {
        hmp.put(key,value);
    }
    
    public int get(int key) {
        if(hmp.isEmpty() || !hmp.containsKey(key)) return -1;
        return hmp.get(key);
    }
    
    public void remove(int key) {
        hmp.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */