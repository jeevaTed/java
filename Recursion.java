public class Recursion {
    public static void main(String[] args) {
       num(10);
    }
    public static void num(int a){
        if(a==1){
            System.out.println(1);
        } 
         else {
            System.out.println(a);
            num(a-1);
        }
    }
}
