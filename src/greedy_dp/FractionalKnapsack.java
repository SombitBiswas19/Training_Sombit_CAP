package greedy_dp;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    static class Item {
        int weight;
        int value;
        double ratio;
        public Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
            this.ratio = (double) value / weight;
        }
    }

    public static double getMaxValue(int capacity, int[] weights, int[] values) {
        int n = weights.length;
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Item(weights[i], values[i]);
        }
        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return Double.compare(o2.ratio, o1.ratio);
            }
        });

        double totalValue = 0d;
        for (Item item : items) {
            if (capacity == 0) break;

            if (item.weight <= capacity) {
                capacity -= item.weight;
                totalValue += item.value;
            } else {
                totalValue += (item.ratio * capacity);
                capacity = 0; // Knapsack full
            }
        }
        return totalValue;
    }

    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int capacity = 50;

        double maxValue = getMaxValue(capacity, weights, values);
        System.out.println("Maximum value in Knapsack: " + maxValue);
    }
}
