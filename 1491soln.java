class Solution {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        int sum = 0;

        for (int n : salary) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        return (double)(sum - min - max) / (salary.length - 2);
    }
}