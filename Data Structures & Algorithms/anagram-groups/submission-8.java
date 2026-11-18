class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        int n = strs.length;
        for(String s : strs){
            String frequencyString = getFrequency(s);
            if(map.containsKey(frequencyString)){
                map.get(frequencyString).add(s);
            }else{
                ArrayList<String> lst = new ArrayList<>();
                lst.add(s);
                map.put(frequencyString,lst);
            }
        }
        
        return new ArrayList<>(map.values());
    }

    public String getFrequency(String s){
        StringBuilder res = new StringBuilder();
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        char ch = 'a';
        for(int i=0; i<26; i++){
            res.append(ch);
            res.append(freq[ch-'a']);
            ch++;
        }
        return res.toString();
    }
}