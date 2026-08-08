public class sqaure {
    public static void main (String [] args){
        // =====Sqaure with star=====
        // int n  = 16;
        // for(int i = 0 ; i < n ; i++){
        //     if(i%4 == 0){
        //      System.out.println();
        //     }
        //     System.out.print("* ");
        // }

        //==== With numbers ======
        
        // for(int i = 1 ; i <= 4 ; i++ ){
            
        //     for(int j = 1 ; j <=4 ; j++){
        //         System.out.print(i + "");
        //     }
        //      System.out.println();
            
        // }

        // ===== Hollow Square ====
        int n = 5;

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                if(i==1 || i == n || j == 1 || j== n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();

        }

        
    }
}
