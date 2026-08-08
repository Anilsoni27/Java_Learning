public class logical_operator {
    public static void main(String[] args) {
        int x = 7;
        int y = 5;
        int a = 8;
        int b = 9;

        boolean res1 = x > y && a > b;
        System.out.println(res1);

        boolean res2 = x > y || a > b;
        System.out.println(res2);
        
        boolean res3 = x < y || a < b || a > 1;
        System.out.println(res3);
    }
}
