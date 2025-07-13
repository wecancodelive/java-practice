package in.balamt.practice.coding.challenges.heightchecker;

import in.balamt.practice.util.JavaPracticeUtils;

public class HeightCheckerApp {

    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
        HeightCheckerApp app = new HeightCheckerApp();
        int result = app.heightChecker(heights);
        JavaPracticeUtils.printLine("Number of students not in correct order: " + result);
    }
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        java.util.Arrays.sort(expected);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }
}