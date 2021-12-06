public class Exchange {
    public static void main(String[] args) {
        //for integer data-type
        //int a = Integer.parseInt(args[0]);
        //int b = Integer.parseInt(args[1]);
        
        // for string data-type 
        String a = args[0];
        String b = args[1];

        String t = a;
        a = b;
        b = t;
        System.out.println(a);
        System.out.println(b);

    }
}
