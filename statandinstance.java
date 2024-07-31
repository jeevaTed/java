public class statandinstance {
    public static void main(String[] args){
        res.hello("sakthi");
    }
}
class res{
    static String name;
    public static void hello(String str){
        name=str;
        System.out.println(name);
    }
}
