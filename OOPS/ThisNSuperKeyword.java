class A{
    
    public A() {
        super(); // Default , always present
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println("in int A");
    } 
}
class B extends A{
    public B() {
        super();
        System.out.println("in B");
    }
    public B(int n){
        this();   // call the constructor of same class
        System.out.println("in int B");
    } 
}
public class ThisNSuperKeyword {
    public static void main(String[] args) {
        B obj = new B(2);

        
    }
    
}
