public class PowerOfTwo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int i = 0;
        int value = 1;

        while (i<=n){
            value = value*2;
            i = i + 1;

            System.out.println(value);
        }
        
    }
    
}
