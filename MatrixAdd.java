import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter order for row1(matrix 1)");
        int row1=obj.nextInt();
        System.out.println("enter order for col1(matrix 1)");
        int col1=obj.nextInt();
        System.out.println("enter order for row2(matrix 2)");
        int row2=obj.nextInt();
        System.out.println("enter order for col2(matrix 2)");
        int col2=obj.nextInt();

        if(row1==row2 && col1==col2){
            int a[][]=new int[row1][col1];
            int b[][]=new int[row2][col2];
            int c[][]=new int[row1][col1];

            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    System.out.println("enter the value of 1st mat : "+i+" "+j);
                    a[i][j]=obj.nextInt();
                }
            }
            for(int i=0;i<b.length;i++){
                for(int j=0;j<b[i].length;j++){      
                    System.out.println("enter the value of 2st mat : "+i+" "+j);
                    b[i][j]=obj.nextInt();
                }
            }
            System.out.println("Addition of two matrix");
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    c[i][j]=a[i][j]+b[i][j];
                    System.out.print(c[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }            
        }        
        else{
            System.out.println("pls check the order of matrix");
        }  
    }
}
