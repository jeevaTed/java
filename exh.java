class sa{
    // void add(){
    //     System.out.println("add");
    // }
}
public class exh {
    public static void main(String[] args) {
        // sa obj=new sa();
        // try{

        // }catch(ArithmeticException e){
        //     System.out.println("error");
        // }
        // obj.add();
        try{
            int[] c=null;
            System.err.println(c[0]);
            int a=2,b=5;
            System.out.println(a+b);
        }
        catch(ArithmeticException a){
            System.out.println("Exception");
        }
        catch(NullPointerException n){
            System.out.println("null exp");
        }
        catch(Exception e){
            System.out.println("basic Exception");
        }
        finally{
            int a=2,b=5;
            System.out.println(a+b);
            System.out.println("Finally");
        }
        System.out.println("teddy");
    }
}
