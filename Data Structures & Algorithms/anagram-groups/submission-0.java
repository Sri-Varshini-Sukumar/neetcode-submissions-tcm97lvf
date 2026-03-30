class Solution {
    public String getFrequency(String str){
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[26];
        for(char ch : str.toCharArray()){
            freq[ch-'a']++;
        }
        char ch = 'a';
        for(int i : freq){
            sb.append(ch);
            sb.append(i);
            ch++;
        }
        return sb.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String,List<String>> hmp = new HashMap<>();
        for(String str : strs){
            String freq = getFrequency(str);
            if(hmp.containsKey(freq)){
                hmp.get(freq).add(str);
            }else{
                List<String> lst = new ArrayList<>();
                lst.add(str);
                hmp.put(freq,lst);
            }
        }
        return new ArrayList<>(hmp.values());
    }
}
