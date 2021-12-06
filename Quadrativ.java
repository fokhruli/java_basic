public class Quadrativ {
    public static void main(String[] args) {
        // take b and c value in command prompt
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);

        // calculate discriminant value x*x + b*x + c = 0
        double discriminant = b*b - 4.0*c;
        double d_sq = Math.sqrt(discriminant);

        System.out.println((-b + d_sq)/2.0);
        System.out.println((-b - d_sq)/2.0);
    }
}
