// It makes string mutable

// StringBuffer are thread safe and stringBuilder not

public class stringBufferandBuilder {
    public  static void main(String [] args){
        StringBuffer sb = new StringBuffer(" Anil ");


        sb.append("Soni");

        sb.setLength(30);

        sb.insert(0, "Java");

        sb.ensureCapacity(100);

        System.out.println(sb);



    }
}
