import java.util.Scanner;

public class alci{
    public static void main(String[] args){
        System.out.println("menu");
        System.out.println("1 for Addition");
        System.out.println("2 for Subtraction");
        System.out.println("3 for multipication");
        System.out.println("4 for divition");
        System.out.println("Select any number");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();

        Alciarith o=new Alciarith();


        System.out.println("Enter 2 numbers");
        int one=sc.nextInt(),two=sc.nextInt();

        switch (a){
            case 1:
            int result=o.add(one,two);
            System.out.println("addition of 2 numbers : "+result);
            break;
            case 2:
            int result2=o.sub(one,two);
            System.out.println("sub of 2 numbers : "+ result2);
            break;
            case 3:
            int result3=o.multi(one,two);
            System.out.println("multi of 2 numbers : "+result3);
            break;
            case 4:
            int result4=o.divi(one,two);
            System.out.println("divis of 2 numbers : "+result4);
            break;
            default:
            int result5=o.modu(one,two);
            System.out.println("modulo of 2 numbers : "+result5);
            break;
        }
        sc.close();
    }
}