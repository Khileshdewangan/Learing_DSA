import java.util.ArrayList;
import java.util.Collections;

public class K_96_jobSequence {
    static class job{
        int id;
        int deadline;
        int profit;
        
        public job(int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int [][] jobInfo = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<job> jobs = new ArrayList<>();
        for(int i=0; i< jobInfo.length;i++){
            jobs.add(new job(i, jobInfo[i][0], jobInfo[i][1]));
        }
        
        Collections.sort(jobs, (a,b) -> b.profit-a.profit);
        ArrayList<Integer> seq = new ArrayList<>();

        int time =0;
        for(int i=0; i<jobs.size();i++){
            job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("Maximum Job = "+ seq.size());
        for(int i=0; i<seq.size(); i++){
            System.out.println(seq.get(i)+" ");

        }
    }
}
