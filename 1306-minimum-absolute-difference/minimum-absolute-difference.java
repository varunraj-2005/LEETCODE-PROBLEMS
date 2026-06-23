class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> l = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i+1])<min){
                l.clear();
                l.add(Arrays.asList(arr[i],arr[i+1]));
                 min=Math.abs(arr[i]-arr[i+1]);

            }
            else if(Math.abs(arr[i]-arr[i+1])==min){
                l.add(Arrays.asList(arr[i],arr[i+1]));
                min=Math.abs(arr[i]-arr[i+1]);
            }
        }
        return l;
    }
}