class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> hmp1 = new HashMap<>();
        HashMap<Character,Integer> hmp2 = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            if(!hmp1.containsKey(s.charAt(i))){
                hmp1.put(s.charAt(i),i);
            }

            if(!hmp2.containsKey(t.charAt(i))){
                hmp2.put(t.charAt(i),i);
            }

            if(!hmp1.get(s.charAt(i)).equals(hmp2.get(t.charAt(i)))){
                return false;
            }
        }

        return true;
    }
}