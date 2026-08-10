class Mobile{
    String Brand;
    int price ;
    static String name;

    public void show(){
        System.out.println(Brand +" : "+ price +" : "+ name);
    }
}
 /// Static variable shared by different the object , and can be accessed by class name 
 /// Static variable can be used in non static method
public class static_variable {
    public static void main(String [] args){
        Mobile obj1 = new Mobile();
        obj1.Brand = "Apple";
        obj1.price = 2343;
        Mobile.name= "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.Brand = "Realme";
        obj2.price = 2342;
        Mobile.name= "Smartphone";

        obj1.name = "Telephone"; // it will affect all the object 

        obj1.show();
        obj2.show();
    }
    
}
