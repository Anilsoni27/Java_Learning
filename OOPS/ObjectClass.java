
import java.util.Objects;

class Laptop {
    String model;
    int price ;

    // compares hashcode 

    public boolean equals(Laptop that){

        return this.model.equals(that.model) && this.price == that.price;
    }

    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.model);
        hash = 59 * hash + this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Laptop other = (Laptop) obj;
        if (this.price != other.price) {
            return false;
        }
        return Objects.equals(this.model, other.model);
    }

}
public class ObjectClass {
    public static void main(String [] args){

        Laptop obj = new Laptop();
        obj.model = "Lenovo Yoga";
        obj.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo Yoga";
        obj2.price = 1000;

        boolean result = obj.equals(obj2);
        System.out.println(result);

    }
    
}
