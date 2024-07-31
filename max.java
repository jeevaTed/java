import java.util.*;
public class max{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nums : ");
        int a[]=new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        int max=a[0];
        for(int j=0;j<a.length;j++){
            if(a[j]>max)
            max=a[j];
        }
        System.out.println("maximum value : "+max);
    } 
}