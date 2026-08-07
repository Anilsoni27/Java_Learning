public class if_else {
    public static void main(String [] args){
        int x = 8;
        int y = 7;
        int z = 6;
        

        if(x > y){
            System.out.println(x);

        }
        else
            System.out.println(y);

        if(x > 10 && x <= 20){
            System.out.println("Hello");
        }
        else
         System.out.println("Bye");

        if(x > y && x > z){
            System.out.println(x);
        }
        else if(y > x && y > z){
            System.out.println(y);
        }
        else
            System.out.println(z);

        //=======Ternary Opeator=======

        // int res = 0;
        // res = x % 2 == 0 ? 10 : 20;

        // System.out.println(res);


        
    }
    
}
