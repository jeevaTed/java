class pub{
    final int a=10;
    int c,b;
    int add(int c,int b){
        this. c=c;
        this. b=b;
        int f=c+b;
        return f;
    }
    final void add(){
        System.out.println("jeeva");
    }
}
class bio extends pub{
    // void add();Cannot override the final method from pubJava

}
public class key {
    public static void main(String[] args){
        pub obj=new pub();
        // obj.a=11;The final field pub.a cannot be assignedJava
        System.out.println("teddy");
        int g=obj.add(23, 45);
        System.out.println(g);
        obj.add();
        System.out.println(obj.a);
        
    }
}
