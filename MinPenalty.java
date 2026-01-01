
public class MinPenalty{
public int findMinPenalty(String s){
    int n = s.length();

    int []prefixN = new int[n+1];
    int []sufixY = new int[n+1];

    for(int i=0;i<n;i++){
        prefixN[i]=prefixN[i-1];
        if(s.charAt(i)== 'N'){
            prefixN[i]++;
        }

    }

    for(int i = n-1; i>=0;i--){
        sufixY[i]= sufixY[i-1];
        if(s.charAt(i)== 'Y'){
            sufixY[i]++;
        }
    }

    int minPenalty = Integer.MAX_VALUE;
    int answer=0;

    for(int j=0;j<=n;j++){
        int minPenalty= prefixN[j]+sufixY[j];

        if(penalty < minPenalty){
            minPenalty =penalty;
            answer =j;
        }
    }

    return answer;




}
}