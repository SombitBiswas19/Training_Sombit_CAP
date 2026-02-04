package greedy_dp;

import java.util.*;

class ActivitySelection {

    static class Activity {
        int start, finish;

        Activity(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }

    public static void selectActivities(int[] start, int[] finish) {

        int n = start.length;

        Activity[] activities = new Activity[n];

        for (int i = 0; i < n; i++) {
            activities[i] = new Activity(start[i], finish[i]);
        }

        // Sort by finish time
        Arrays.sort(activities, (a, b) -> a.finish - b.finish);

        System.out.println("Selected Activities:");

        // Always select first activity
        int lastFinish = activities[0].finish;
        System.out.println("(" + activities[0].start + ", " + activities[0].finish + ")");

        // Select remaining activities
        for (int i = 1; i < n; i++) {
            if (activities[i].start >= lastFinish) {
                System.out.println("(" + activities[i].start + ", " + activities[i].finish + ")");
                lastFinish = activities[i].finish;
            }
        }
    }

    public static void main(String[] args) {

        int[] start = {1, 3, 0, 5, 8, 5};
        int[] finish = {2, 4, 6, 7, 9, 9};

        selectActivities(start, finish);
    }
}