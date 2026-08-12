// Lambda expression only use with the functional interface
interface A 
{
    // void show();
    // void show1(int i);
    int add(int a , int b);
}

public class LambdaExpression {
    public static void main (String [] args){

        // A obj = () -> System.out.println("Showing...");
        // obj.show();

        // A obj1 = i -> System.out.println("With Parameter :" + i);
        // obj1.show1(3);

        A obj2 = (a,b) ->  a + b;
        int r = obj2.add(3, 4);
        System.out.println("Addition =" + r);
    }
}