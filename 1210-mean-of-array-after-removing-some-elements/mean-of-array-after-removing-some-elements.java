class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);int sum=0,a=0;
        for(int i=(int)(0.05*arr.length);i<arr.length-(int)(0.05*arr.length);i++){
            sum+=arr[i];
            a++;
        } 
        return (double)sum/a;  
    }
}