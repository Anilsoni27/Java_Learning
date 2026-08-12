// Exception is super class so always palce this at the last in catch block

// Object (extends->) Throwable -> Exception And Error
// Error cannot be handlded
// Exception -> RuntimeException(Unchecked)  And (SQLException And IOException)Checked Exception

public class ExceptionHandling {
    
    public static void main(String[] args) {
        
        int i = 0;
        int j = 2;
        String str = null;

        int [] arr = new int[4];

        try{

            //j = 18 / i ;

            // System.out.println(arr[2]);
            // System.out.println(arr[5]);
            System.out.println(str.length());

        }
        catch(ArithmeticException e){

            System.out.println("Cannot divide by zero: "+e);
        }
        catch(ArrayIndexOutOfBoundsException e ){

            System.out.println("Do not go beyond index: " + e);
        }
        catch(Exception e){

            System.out.println("Something went wrong "+e);
        }
        System.out.println(j);
        System.out.println("Byeee");
    }
}
