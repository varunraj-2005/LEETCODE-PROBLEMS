class Solution {
    public int minimumOperations(int[] nums) {
        //boolean b = false;
        List<Integer> l = new ArrayList<>(Arrays.stream(nums).boxed().toList());
       
        int count=0;
        while(true){
             int[] arr = new int[101];
            for(int i:l){
                arr[i]+=1;
            }
            boolean c = true;
            for(int i:l){
                if(arr[i]>1){
                    c=false;
                    break;
                }
            }
            if(c) return count;
            else{
                for(int i=0;i<3 && !l.isEmpty();i++){
                    l.remove(0);
                }
            }
            count++;
        }
       // return count;
    }
}