class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> need = new HashMap<>();
        HashMap<Character,Integer> have = new HashMap<>();

        for(int i=0; i<s1.length(); i++){
            need.put(s1.charAt(i),need.getOrDefault(s1.charAt(i),0)+1);
        }

        int end = 0;
        int start = 0;
        int n = s2.length();

        while(end < n){
            char ch = s2.charAt(end);
            if(!need.containsKey(ch)){
                end++;
                start = end;
                if(have.isEmpty()) continue;
                have.clear(); 
                continue;
            }
            if(!have.containsKey(ch)){
                have.put(ch,0);
            }
            have.put(ch,have.get(ch)+1);

            while(have.get(ch) > need.get(ch)){
                char startChar = s2.charAt(start);
                have.put(startChar,have.get(startChar)-1);
                start++;
            }

            int windowSize = end - start + 1;
            if(windowSize == s1.length()){
                return true;
            }
            end++;
        }
        return false;
    }
}
