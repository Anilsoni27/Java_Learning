
// For custom exception make a class which extends Exception class and if we wnat to give any parameter in constructor so we have to call super
class MyException extends Exception{
    public MyException(String str){
        
        super(str);
    }
}
public class CustomException {
    public static void main (String [] args){

        int i = 20;
        int j = 0;

        try{
            j = 18 / i;
            if(j == 0){
                throw new MyException ("I dont want exception" );
            }
        }
        catch(MyException e){
            j = 18 / 1;
            
            System.out.println("Thats default output: "+ e );
        }
        System.out.println(j);
    }
    
}
