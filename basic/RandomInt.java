public class RandomInt {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        // create random value [0-1]
        double r = Math.random();
        int ans = (int) (r*(N+1));

        System.out.println(ans);
    }
}
