import java.util.*;

public class ActivitySelection {
    public static void main(String args[]) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i; // index
            activities[i][1] = start[i]; // startTime
            activities[i][2] = end[i]; // endTime
        }

        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));// sort by end time

        int maxAct = 1; // first activity always chosen
        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(activities[0][0]);

        int lastEnd = activities[0][2];
        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Max Activity Chosen: " + maxAct);
        System.out.println("Activity Chosen: " + ans);
    }
}