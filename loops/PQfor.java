public class PQfor {
    public static void main(String[] args) {
        int  f = 0, g = 1;
        System.out.println("i" + "    " + "f" + "    " + "g");
        for(int i = 0; i<=10; i++)
        {
            System.out.println(i + "    " + f + "    " + g);
            f = f+g;
            g = f-g;

        }
    }
    
}
