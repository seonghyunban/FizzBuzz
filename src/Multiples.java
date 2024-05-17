public class Multiples {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 5 == 0 || i % 3 == 0 ) {
                ++n;
            }
        }
        System.out.println(n);
    }
}
