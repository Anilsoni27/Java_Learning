// class A {

//     public void show(){

//       System.out.println("In A showww");

//     }
// }

abstract class B {

    public abstract void show();
    public abstract void config();
}

public class AnonymousInnerClass {
    public static void main(String [] args){

        // A obj = new A()
        // {
        //     public void show(){

        //      System.out.println("In neww showww");

        //     }
        // };  // use semicolonnn
        // obj.show();


        B obj = new B() {
            
            public void show(){

              System.out.println("In B showww"); //  we are creating obj of inner anonymous class

            }
            public void config(){

                System.out.println("B configuration");

            }
      
        };
        obj.show();
        obj.config();

    }
}
