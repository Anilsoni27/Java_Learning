class A {
    
    public A (){
        System.out.println("Object created...");
    }

    public void show(){
        System.out.println("in A show");

    }
}

public class Anonymous{
    public static void main(String[] args) {
        
        // new A ();  // it is a anonymous object which is without reference variable
        new A().show(); // Always create new object in heap and cannot be reuse
    }
}