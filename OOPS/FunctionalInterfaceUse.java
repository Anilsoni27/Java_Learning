@FunctionalInterface

interface A{

    void show();
    
}

public class FunctionalInterfaceUse{
    public static void main(String [] args){

        A obj = new A(){

            public void show(){
                System.out.println("Showing...");
            }   
        };
        obj.show();
        

    }
}