enum Laptop{
    Macbook(2000),XPS,HP(3000),Lenovo(4000);
    
    private int price;


    private Laptop() { // it called once
        price = 5054;
    }

    private Laptop(int price) { // it will be called 3 times
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
public class EnumUse2 {
    public static void main(String [] args){
        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap);
        // System.out.println(lap+":"+lap.getPrice());

        Laptop [] lap = Laptop.values();

        for(Laptop L : lap){
            System.out.println(L+" : "+L.getPrice());
        }


    }
    
}
