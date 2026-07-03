class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int arr[] = new int[n];
        for(int i=1;i<=n;i++){
            arr[i-1]=i;
        }
        List<List<Integer>> ll = new ArrayList<>();
        com(arr,ll,k,new ArrayList<>(),0);
        return ll;
    }
    public static void com(int[] arr,List<List<Integer>> ll,int k,List<Integer> l,int i){
        if(l.size()==k){
            //System.out.println(l+" ");
            ll.add(new ArrayList<>(l));
            return;
        }
        for(int j=i;j<arr.length;j++){
            l.add(arr[j]);
            com(arr,ll,k,l,j+1);
            l.remove(l.size()-1);
        }
    }
    public static boolean freq(List<Integer> l){
        int a[] = new int[21];
        int max=0;
        for(int i:l){
            a[i]++;
            if(a[i]>1) return false;
        }
        return true;
    }
}