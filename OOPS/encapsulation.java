class Emloyee {

    private int age ;
    private String name ;

    public int getAge(){

        return age ;
    }

    public String getName(){
        return name;
    }

    // public void setAge(int a){
    //     age = a;
    // }


// ===== this keyword ======
//  this keyword is used to defferentiate b/w the local and instance variable .


    public void setAge(int age){

        this.age = age;
    }

    public void setName(String name){

        this.name = name;
    }
}

public class encapsulation {
    public static void main (String [] args){
        Emloyee obj = new Emloyee();
        // obj.age = 23 ;
        // obj.name = "Mukesh";

        obj.setAge(45);
        obj.setName("Priya");

        System.out.println(obj.getName() +" : "+obj.getAge());


    }
}
