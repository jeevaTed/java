package jeeva;

public class Edex1 {
    public static void main(String[] args) {
        add();
        // int d=add(45, 56);
        // System.out.println(d);
        Edex1 obj=new Edex1();
        obj.add(56, 56);
        obj.add1("jiiva","dhii");
    }
    private static void add(){
       int a=14;
       int b=23;
        int c=a+b;
        System.out.println(c);
    }
    int add(int a,int b){
        int c=a+b;
        return c;
    }
    String add1(String me,String mine){
        String world=me+" "+mine;
        return world;
    }
}
