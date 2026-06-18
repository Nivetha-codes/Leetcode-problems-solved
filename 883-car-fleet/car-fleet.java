class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        double[] time = new double[position.length];
        Integer[] idx = new Integer[position.length];
        double currTime = 0;
        double maxTime = 0;
        int fleet = 0;

        for (int i = 0; i < position.length; i++) {
            time[i] = (double) (target - position[i]) / speed[i];
            idx[i] = i;
        }

        Arrays.sort(idx,
                (a, b) -> position[b] - position[a]); //descending order

        for (int index : idx) {
            currTime = time[index];
            if (currTime > maxTime) {
                fleet += 1;
            }
            maxTime = Math.max(currTime, maxTime);

        }

        return fleet;

    }
}