

// In every thread you need to have run method
class A extends Thread {
    public void run(){
        for (int i = 0; i < 100; i++){

            System.out.println("Hii");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
class B extends Thread {
    public void run (){
        
        for (int i = 0; i < 100; i++) {

            System.out.println("Hellooo");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
}
public class AboutThreads {
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();
        // System.out.println(obj1.getPriority()); // give current priority of thread which range from 1-10

        // obj2.setPriority(Thread.MAX_PRIORITY); //setting priority means suggesting 



        obj1.start();
        try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        obj2.start();

        
    }
    
}
