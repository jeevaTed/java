import java.util.*;
public class aray{
    public static void main(String[] args){
        int a[][]=new int[5][4];
        a[0][0]=1;
        a[1][0]=2;
        a[2][0]=3;
        a[3][0]=4;
        a[4][0]=5;
        for(int i=0;i<a.length;i++){
            System.out.println("i-length"+a.length);
            System.out.println("value of i: "+i);
            for(int j=0;j<a[i].length;j++)
            {
                System.out.println(a[i].length);
                
                System.out.println();
                System.out.print("value of j: "+j+"  ");
                System.out.print(a[i][j]);
            }
            System.out.println();
            System.out.println("j-length"+a[i].length);
            System.out.println();
            
        }
        // for Each
        // for(int d : a){
        //     System.out.print(d);
        // }
    }
}