interface A   // interface have all the method by default public abstract
{ 
    int age = 45;   // All the variable in the interface are final and static
    String name = "Sneha"; // the variable cannot be declared , it is intialized b/c interface has no memory in heap

   void show(); // we dont need to write public abstract 
   void config();
}

class B implements A{

    public void show(){
        System.out.println("Showing...");
    }
    public void config(){
        System.out.println("Configurring...");
    }
}
public class Interface{
    public static void main(String [] args){

        B obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.age+" : "+A.name);  // as variable aree static so can call with class anme
    }
}