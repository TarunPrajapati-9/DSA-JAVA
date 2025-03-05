import java.util.*;

public class JobSequencing {
    class Job {
        int id;
        int deadline;
        int profit;

        public Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    ArrayList<Job> jobs;

    public void newApproach(int[][] jobsInfo) {
        jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit); // sorting in descending order

        ArrayList<Integer> selectedSequence = new ArrayList<>();

        int time = 0;
        int profit = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                selectedSequence.add(curr.id);
                profit += curr.profit;
                time++;
            }
        }

        System.out.println("Selected Job At index : " + selectedSequence);
        System.out.println("Max Profit : " + profit);
    }

    public void basicApproach(int jobs[][]) {
        int n = jobs.length;
        int jobsWithIndex[][] = new int[n][3];

        for (int i = 0; i < n; i++) {
            jobsWithIndex[i][0] = i; // id
            jobsWithIndex[i][1] = jobs[i][0]; // deadline
            jobsWithIndex[i][2] = jobs[i][1]; // profit
        }
        Arrays.sort(jobsWithIndex, (a, b) -> Integer.compare(b[2], a[2])); // descending sorting based on profit

        ArrayList<Integer> selectedSequence = new ArrayList<>();

        int time = 0;
        int profit = 0;
        for (int i = 0; i < n; i++) {
            if (jobsWithIndex[i][1] > time) {
                profit += jobsWithIndex[i][2];
                time++;
                selectedSequence.add(jobsWithIndex[i][0]);
            }
        }

        System.out.println("Selected Job At index : " + selectedSequence);
        System.out.println("Max Profit : " + profit);
    }

    public static void main(String args[]) {
        int jobs[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } }; // (deadline,profit)
        JobSequencing j1 = new JobSequencing();
        j1.newApproach(jobs);

        j1.basicApproach(jobs);
    }
}
