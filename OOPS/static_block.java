class Mobile{
    String Brand;
    int price ;
    static String name;

    public Mobile(){
        Brand = "";
        price = 200;
        System.out.println("in constructor");
    }

    // static block is used to intialize static variable
// satatic block loaded only once irrespective of obj created
    static{     // it run fast b/c class load first and then the obj created
        name = "Phone";
        System.out.println("in static block");
    }
}
public class static_block {
    public static void main(String[] args) throws ClassNotFoundException {
        // Mobile obj1 = new Mobile();
        // obj1.Brand = "Apple";
        // obj1.price = 2343;
        // Mobile.name= "Smartphone";

        // Mobile obj2 = new Mobile();
        // if we dont create obj it will not call both the block but there is special call for that

        Class.forName("Mobile");  // it will not create obj , just instanciated means it only load class


    }
}
