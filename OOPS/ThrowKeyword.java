public class ThrowKeyword {
    
    public static void main(String[] args) {
        
        int i = 20;
        int j = 0;

        try{
            j = 18 / i;
            if(j == 0){
                throw new ArithmeticException ("I dont want exception" );
            }
        }
        catch(ArithmeticException e){
            j = 18 / 1;

            System.out.println("Thats default output: "+ e );
        }
        System.out.println(j);
        
    }
}  

