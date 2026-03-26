class Solution {
    public int countMatches(List<List<String>> items, String rulekey, String rulevalue) {
        int indx = 0 ;
        if(rulekey.equals("color")) indx = 1;
        else if(rulekey.equals("name")) indx = 2;
        int ct = 0;
        for(List<String> item : items) {
            if(item.get(indx).equals(rulevalue)) {
                ct++;
            }
        }
        return ct;
    }
}