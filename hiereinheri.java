class comsub{
    void basic(){
        System.out.println("basic subjects");
    }
    int tamil;
    int english;
    int maths;
    int che;
    int phy;
}
class bio extends comsub{
    int biomax;
}
class sci extends comsub{
    int sci;
}
public class hiereinheri {
    public static void main(String[] args){
        bio obj=new bio();

        sci obj1=new sci();
    }
}
