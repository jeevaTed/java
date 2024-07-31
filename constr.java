public class constr {
    public static void main(String[] args){
        sa obj=new sa(12,200);
        System.out.println(obj.rollno);
        System.err.println(obj.marks);
        obj.rollno=20;
        obj.marks=500;
        System.out.println(obj.rollno);
        System.err.println(obj.marks);

    }
}
    class sa{
        int rollno;
        int marks;
    sa(int r,int m){
        System.out.println("constructor");
        rollno=r;
        marks=m;
    }        
    }


