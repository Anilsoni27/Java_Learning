
class A {

    public void Show() throws ClassNotFoundException {

        Class.forName("calc");

    }

}
public class ThrowsKerword {
    static{

        System.out.println("Class Loaded");
    }
    public static void main (String [] args) {
        A obj = new A();
        
        try {
            obj.Show();
        } catch (ClassNotFoundException e) {
            
            e.printStackTrace();
        }
        

    }
}
