class A {
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A {
    public void show(){
        System.out.println("in B show");
    }
}
class C extends B {
    public void show(){
        System.out.println("in C show");
    }
}
class D {
    public void show(){
        System.out.println("in D show");
    }
}
public class DynamicDispatch {
    public static void main(String [] args){

        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

        // obj = new D(); // Dynamic dispatch only work with parent-child relation or inheritnce
        // obj.show();


    }
    
}
