// Abstract methods only belongs in Abstract class 
// Abstract class cannot have obj , it will done with extending the class
// Abstract methods only declare into the abstract class

abstract class Car {

    public abstract void drive();
    public abstract void fly();

    public void playMusic() {

        System.out.println("Playing music......");
    }
}
abstract class WagonR extends Car{  // class cannot implement all the abstarct method this it will become abstract class

    public void drive(){

        System.out.println("Driving....");
    }
}
class UpWagonR extends WagonR{

    public void fly(){

        System.out.println("Flying....");
    }
}

public class AbstractKeyword {
    public static void main(String [] args){

        Car obj = new UpWagonR();
        obj.playMusic();
        obj.drive();
        obj.fly();
    }
    
}
