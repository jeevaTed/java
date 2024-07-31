abstract class par{
    abstract void r();
    void runn(){
        System.out.println("run");
    }
}
class two extends par{
    void r(){
    }
}
public class abstra {
    public static void main(String[] args){
        two obj=new two();
        obj.runn();
        run obj1=new run();
        obj1.meth1();
    }
}
interface inter{
    abstract void meth1();
}
interface outer{
    abstract void meth2();
}
class run implements inter,outer{
    public void meth1(){
        System.out.println("hgig");
    }
    public void meth2(){

    }
}
// public class abstra{
//     public static void main(String[] args) {
//         run obj=new run();
//         obj.meth1();
//         // two obj=new two();
//         // obj.run();
//     }

