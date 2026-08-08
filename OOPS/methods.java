class Computer{

    public void playmusic(){
        
        System.out.println("Playing music.....");
    }

    public String getMepen(int cost){
        if(cost >= 10){
            return "Pen";
        }
        else{
            return "Nothing";
        }
        
    }
}
public class methods {
    public static void main(String [] args){
        Computer obj = new Computer ();
        obj.playmusic();
        String str = obj.getMepen(5);
        System.out.println(str);
    }
    
}
