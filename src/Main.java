public class Main {

    public static int trailingZeroes(int n) {
        int zeroes = 0;

        for (int i = 5; i <= n ; i *= 5) {
            zeroes += n / i;
        }

        return zeroes;
    }


    public static void main(String[] args) {

        int n = 200;

        System.out.println(trailingZeroes(n));
    }
}