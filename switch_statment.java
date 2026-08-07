public class switch_statment {
    public static void main(String [] args){
        int n = 2 ;

        switch(n){

            // case 1 :
            //     System.out.println("Monday");
            //     break;
            // case 2 :
            //     System.out.println("Tuesday");
            //     break;
            // case 3 :
            //     System.out.println("Wensday");
            //     break;
            // case 4 :
            //     System.out.println("Thursday");
            //     break;  
            // default:
            //     System.err.println("Invalid");

            //======New switch statement======

            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            default -> System.out.println("Invalid");



        }
    }
}
