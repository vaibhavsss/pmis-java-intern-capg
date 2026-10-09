package HackerRank.October_9;

public class specialNumber {

    public static int isSpecialNumber(int n) {
        int[] fact = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};

        int temp = n;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += fact[digit];
            temp /= 10;
        }

        return (sum == n) ? 1 : 0;
    }
}