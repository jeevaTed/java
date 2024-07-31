import java.util.*;
public class statements {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the value : ");
        int m1=obj.nextInt(),m2=obj.nextInt(),m3=obj.nextInt(),m4=obj.nextInt(),m5=obj.nextInt();
        float avg=(m1+m2+m3+m4+m5)/5;
        if(m1>=35 && m2>=35 && m3>=35 && m4>=35 && m5>=35){
            if(avg>90 && avg<=100){
                System.out.println("grade A");   
            }
            else if(avg<=90 && avg>80){
                System.out.println("grade B");
            }
            else if(avg<=80 && avg>70){
                System.out.println("grade C");
            }
            else if(avg<=70 && avg>60){
                System.out.println("grade D");
            }
        }
        else{
            System.out.println("fail");
        }
    }    
}
