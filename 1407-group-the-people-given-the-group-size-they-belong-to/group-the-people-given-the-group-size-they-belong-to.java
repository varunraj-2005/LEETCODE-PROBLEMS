class Solution {
    public List<List<Integer>> groupThePeople(int[] g) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        Map<Integer,Integer> m = new HashMap<>();
        for(int i:g){
            m.put(i,m.getOrDefault(i,0)+1);
            a.add(i);
        }
        while(true){
            List<Integer> ll = new ArrayList<>();
            int min=Integer.MAX_VALUE;
            int b=0;
            for(Map.Entry<Integer,Integer> e:m.entrySet()){
                if(e.getValue()<min && e.getValue()!=0){
                    min=e.getValue();
                    b=e.getKey();
                }
            }
            if(b==0){
                break;
            }
            for(int j=0;j<b;j++){
                ll.add(a.indexOf(b));
                a.set(a.indexOf(b),-1);
            }
            m.put(b,m.get(b)-b);
            l.add(ll);
        }
        return l;
    }
}