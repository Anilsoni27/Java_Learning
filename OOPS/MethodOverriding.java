// ===== Method Overriding =====
class Calc {

    public int add (int a , int b){
        return a + b;
    }
    public int sub(int a , int b){
        return a-b;
    }

}
class AdvaCalc extends Calc {
    public int add(int a , int b){
        return a + b + 1;
    }

    public char[] mul(int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mul'");
    }
}
public class MethodOverriding {
    public static void main(String [] args){

        AdvaCalc obj = new AdvaCalc();
        int r1 = obj.add(3, 4);
        int r2 = obj.sub(8,4);
        System.out.println(r1);
        System.out.println(r2);
    }
    
}
