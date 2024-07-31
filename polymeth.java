class overlo{
    int i=10;
    void add(){
        System.out.println("add1");
    }
    void add(int a){
        System.out.println(a);
    }
}
class ad{
    void add(){
        System.out.println("add2");
    }

}
public class polymeth {
    public static void main(String[] args) {
        overlo obj=new overlo();
        obj.add(12);
        obj.add();
        obj.i=20;
        System.out.println(obj.i);
        // ad obj1=new ad();  Override
        // obj1.add();
    }
}

