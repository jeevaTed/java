import java.util.*;

public class witch{
    public static void main(String[] args){
        Scanner gender=new Scanner(System.in);
        System.out.print("Enter a gender : ");
        String gr = gender.nextLine();
        switch(gr){
            case "M" : System.out.println("Male");
            break;
            case "F" : System.out.println("Female");
            break;
            default : System.out.println("Others");
        }
    }
}
