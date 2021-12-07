public class Sqrt {
    public static void main(String[] args) {
        double EPS = 1E-5;
        double C = Double.parseDouble(args[0]);
        double t = C/2;
        double h = 10;
        
        
        while (Math.abs(h)>=EPS)
        {
            // using newton rapshon method...
            h = (t*t - C)/(2*t);
            t = (t - h);
            System.out.println(t);
        }
        System.out.print("final output: " + t);
        //System.out.println(t);
    }
}
