// Constructor is used to assign value when the obj is created
// constructor has same name as class and does not return anything
// every time when obj is constructor called same no.of time
class Bike {
    String color ;
    int Year;

    public Bike () // Default Constructor
    {
        color = "Blue";
        Year = 2020 ;
        System.out.println("in constructor");
    }

    public Bike (String color , int YEAR)  //Parameterized constructor
    {
        this.color = color;
        this.Year = YEAR;

    }

    
}

public class constructor {
    public static void main(String [] args){
        Bike obj = new Bike();
        Bike obj1 = new Bike("Black",2024);
        System.out.println(obj.color+" : "+obj.Year);
        System.out.println(obj1.color+" : "+obj1.Year);

    }
    
}
