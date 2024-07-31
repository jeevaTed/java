import java.util.*;
public class opp{
    public static void main(String[] args){
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("A vaiue is : "+a);
        System.out.println("B value is : "+b);
        System.out.println("After A value is : "+(a+=b));
    }
}