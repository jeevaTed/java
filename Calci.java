import java.util.Scanner;

public class Calci{
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
       
        if(a<=4){
            if(a==1){
                // int result=Alciarith.add(one,two);
                int result=StaaticAlciArith.add(one,two);
                System.out.println("addition of two numbers : "+result);

            }
            else if(a==2){
                int result2=o.sub(one,two);
                System.out.println("subtraction of two numbers : "+result2);
            }
            else if(a==3){
                int result3=o.multi(one,two);
                System.out.println("multiplication of two numbers : "+result3);
            }
            else if(a==4){
                int result4=o.divi(one,two);
                System.out.println("division of two numbers : "+result4);
            }
        }
        else{
            int result5=o.modu(one,two);
            System.out.println("modulus of two numbers : "+result5);
        }

    sc.close();   
    }
}