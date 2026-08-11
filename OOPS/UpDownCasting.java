class A{

    public void show1(){

        System.out.println("In A show1");
    }
}
class B extends A {
    public void show2(){

        System.out.println("In A show2");
    }
}

public class UpDownCasting {
    public static void main(String [] args){
        A obj = new B(); // A obj = (A) new B();
        obj.show1();     // this is upcasting which is done implicitly 

        B obj1 = (B) obj;
        obj1.show2();   // this is down casting

    }
    
}
