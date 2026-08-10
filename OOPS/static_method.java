class Mobile{
    String Brand;
    int price ;
    static String name;

    public void show(){
        System.out.println(Brand +" : "+ price +" : "+ name);
    }

    public static void show1(Mobile obj){ // we cannot use non static variable into static method but with the help of obj refernce it can be done 
        // System.out.println(Brand +" : "+ price +" : "+ name); // Brand and price are non static variable and the variable should be static in static method
        System.out.println(obj.Brand +" : "+ obj.price +" : "+ name);
    }
}
public class static_method {
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

        Mobile.show1(obj1);
    }
    
}
