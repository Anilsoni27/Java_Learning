class A {

    int age ;

    public void show(){

        System.out.println("Showing....");
    }
    static class B{

        public void config(){

         System.out.println("Configuring.....");
        }
    }

}
public class InnercClass {
    public static void main (String [] args){

        A obj = new A();
        obj.show();
        //A.B obj1 = obj.new B();
        // if we make B static class then there is no need to make obj1 but cannot make outer class static
        // A.B obj1 = new A.B();
        //obj1.config();

    }
    
}
