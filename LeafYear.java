public class LeafYear {
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);

        // (divisiable by 4 (year%4)  & not dibisiable by 100 (!(year/100)) + dibisiable by 400 (year%400))
        // the first term check the year divisiable by 4 but not 100 and last part check if year/400 it must be leaf year
        boolean is_leafyear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

        System.out.println(is_leafyear);
    }
}
