class Student {
    int roll_no;
    String name;
    int marks;
}
public class array_of_object {
    public static void main(String [] args){
        Student s1 = new Student();
        s1.roll_no = 123;
        s1.name= "Anil";
        s1.marks = 50 ;
        System.out.println("Name:"+s1.name+" "+"Roll NO.:"+s1.roll_no+" "+"Marks"+s1.marks);

        Student s2 = new Student();
        s2.roll_no = 1234;
        s2.name= "Sunil";
        s2.marks = 50 ;

        Student s3 = new Student();
        s3.roll_no = 1235;
        s3.name= "Manish";
        s3.marks = 60 ;

        Student students [] = new Student [3]; // this line is creating array which store the refrences

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0 ; i < students.length; i++){
            System.out.println(students[i].name+":"+ students[i].roll_no +":"+ students[i].marks);
        }
    }
    
}
