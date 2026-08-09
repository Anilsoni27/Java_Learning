public class string{
    
    public static void main(String[] args) {
        // String name = new String("Anil");// String is a class , when we use it create a new object
        // both are same statement
        String name = "Anil"; //name is the reference variable 

        // System.out.println(name + " Soni");

        // System.out.println(name.concat(" Soni"));
        // System.out.println(name.charAt(1));

        // String are immutable datatype
        name = name + " Soni"; //it does not change  existing string , it only create obj and change the address of name in heap

        String n1 = "Neha";
        String n2 = "Neha"; // it does not create object , it uses n1 address in the stack
        //these upeer two statements does not create two objects in heap , only create two references in stack





    }
}