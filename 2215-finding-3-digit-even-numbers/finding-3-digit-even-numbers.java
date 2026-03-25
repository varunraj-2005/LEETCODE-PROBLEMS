class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> s = new TreeSet<>();
        for(int i=0;i<digits.length;i++){
            if (digits[i]==0) continue;
            for(int j=0;j<digits.length;j++){
                if(i==j) continue;
                for(int k=0;k<digits.length;k++){
                    if(k==i || k==j) continue;
                    if(digits[k]%2==0){
                        int a = digits[i]*100+digits[j]*10+digits[k];
                        s.add(a);
                    }
                }
            }
        }
        int arr[] = new int[s.size()];
        int ind=0;
        for(int i:s){
            arr[ind++]=i;
        }
        return arr;
    }
}