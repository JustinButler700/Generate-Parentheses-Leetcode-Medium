class Solution {
    ArrayList<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        gen(n, "", 0, 0);
        return res;
        
    }
    //We are going to use a recursive solution to generate all permuations.
    public void gen(int n, String s, int open, int close)
    {
        //First, we set our exit condition, such that for every (, we have a )
        if(n==close){
            res.add(s); // add the valid permutation to our list.
            return;
        }
        // we are always allowed to append a (, so long as there are less than n open parenthesis.
        if(open < n){
            gen(n, s+'(', open+1, close);
        }
        // we are only allowed to add ), when close < n.
        if(close < open){
            gen(n, s+')', open, close+1);
        }
        return;
    }
}
