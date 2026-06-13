class Solution {
    public int[] dailyTemperatures(int[] t) {
        int res[] = new int[t.length];
        Stack<Integer> s = new Stack<>();
        for(int i=t.length-1;i>=0;i--){
            while(!s.isEmpty() && t[i]>=t[s.peek()]){
                s.pop();
            }
            if(!s.isEmpty()){
                res[i]=s.peek()-i;
            }
            s.push(i);
        }
        return res;
    }
}