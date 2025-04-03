class Solution {                                                                              // Day 5 after so many days
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;

        while (numBottles >= numExchange) {
            int newBottles = numBottles / numExchange;
            int remBottles = numBottles % numExchange;

            ans += newBottles; // Only add the new bottles obtained
            numBottles = newBottles + remBottles;
        }

        return ans;
    }
}
