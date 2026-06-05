class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();

        if(digits == null || digits.length() == 0){
            return res;
        }

        HashMap<Character,String> hmp = new HashMap<>();
        hmp.put('2',"abc");
        hmp.put('3',"def");
        hmp.put('4',"ghi");
        hmp.put('5',"jkl");
        hmp.put('6',"mno");
        hmp.put('7',"pqrs");
        hmp.put('8',"tuv");
        hmp.put('9',"wxyz");

        backtrack(digits,0,new StringBuilder(),res,hmp);

        return res;
    }

    private void backtrack(String digits, int idx, StringBuilder combination, List<String> res, HashMap<Character,String> hmp){

        if(idx == digits.length()){
            res.add(combination.toString());
            return;
        }

        String letters = hmp.get(digits.charAt(idx));
        for(char i : letters.toCharArray()){
            combination.append(i);
            backtrack(digits,idx+1, combination, res, hmp);
            combination.deleteCharAt(combination.length()-1);
        }
    }
}