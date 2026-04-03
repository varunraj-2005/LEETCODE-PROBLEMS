class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int  ans=0;
        Arrays.sort(players);
        Arrays.sort(trainers);int ind=0;
        for(int i=0;i<players.length;i++){
           for(int j=ind;j<trainers.length;j++){
                if(players[i]<=trainers[j]){
                ans++;
                ind=j;
                trainers[j]=-1;
                break;
            }
           
           }
        }
        return ans;
    }
}