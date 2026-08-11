// Class can implement multiple interface
// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

interface A
{
    void show ();
    void config ();
}
interface X
{
    void run ();
}
interface Y extends X
{

}

class B implements A,Y
{
    public void show(){

        System.out.println("Showing....");
    }
    public void config(){

        System.out.println("Configuring....");
    }
    public void run(){

        System.out.println("Running....");
    }
    
}

public class Interface2 {
    public static void main(String [] args){

        A obj = new B();
        obj.show();
        obj.config();
        
        X obj1 = new B();
        obj1.run();
    }
}
