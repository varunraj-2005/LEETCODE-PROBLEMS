class Solution {
    public String convert(String s, int numRows) {
        StringBuilder [] sb = new StringBuilder[numRows];
        int i=0;
        if(numRows==1 || s.length()<=numRows){
            return s;
        }
        for(int j=0;j<numRows;j++){
            sb[j]=new StringBuilder();
        }
        boolean b = false;
        for(char c:s.toCharArray()){
            sb[i]=sb[i].append(c);
            if(i==0 || i==numRows-1){
                b=!b;
            }
            i+=b?1:-1;
        }
        StringBuilder ss = new StringBuilder();
        for(StringBuilder bu : sb){
            ss.append(bu);
        }
        return ss.toString();
    }
}