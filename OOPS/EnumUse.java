enum Status {

    Running,Failed,Pending,Success;
}

public class EnumUse {
    public static void main (String [] args){
        // Status  s = Status.Failed;
        // System.out.println(s+" : "+s.ordinal());
        // Status [] sA = Status.values();
        // System.out.println(sA[2]);

        // for (Status n : sA){

        //     System.out.println(n+" : "+n.ordinal());
        // }


     // ============IF and Switch ==============
     //   Status s = Status.Failed;

     //   if(s == Status.Failed){
     //     System.out.println("All good");
     //   }
     //   else if(s == Status.Pending){

     //     System.out.println("Try again");

     //   }
     //   else if (s == Status.Running){
     //     System.out.println("Pls Wait");
     //   }
     //   else{
     //      System.out.println("Good byee");
     //   }


     // =========Switch Case===========

     //  Status s = Status.Success;
     //  switch(s)
     //  {
     //    case Running -> System.out.println("All good");
     //    case Pending -> System.out.println("Try Again");
     //    case Success -> System.out.println("Byee");
     //    case Failed -> System.out.println("No wayyyy");
     //    default -> System.out.println("good luck");
     //  }

    }
    
}
