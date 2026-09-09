class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        HashMap<Character,Integer> hmp = new HashMap<>();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            hmp.put(ch,hmp.getOrDefault(ch,0)+1);
        }

        for(int i=0; i<s.length(); i++){
            if(hmp.get(s.charAt(i)) == 1){
                return i;
            }
        }

        return -1;
    }
}