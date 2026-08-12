import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResoures {
    public static void main(String [] args) throws IOException{
        System.out.println("Enter the no.");
        
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));)
        {// it will close resource automatically
         
         int num = Integer.parseInt(br.readLine());
         System.out.println(num);
         System.out.println("Tryyy....");
         
        }
        // finally{ // always use finally
        //     // finally block is meant to close the resource
        //     br.close();
        //     System.out.println("Byeee..");
        // }
        

    }
}
