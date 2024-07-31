
import java.util.Scanner;
import javax.swing.plaf.synth.SynthMenuItemUI;

public class var_data{
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.print("enter a number : ");
        int a,b= obj.nextInt();

        Scanner ch = new Scanner(System.in);
        System.out.print("Enter a name : ");
        String Name = ch.nextLine();

        Scanner flt = new Scanner(System.in);
        System.out.print("Enter 10TH marks % : ");
        float Mark = flt.nextFloat();

        Scanner dubl = new Scanner(System.in);
        System.out.print("Enter salary : ");
        double salary = dubl.nextDouble();
        
    }
}