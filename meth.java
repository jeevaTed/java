public class meth{
    // public static void main(String[] args) {

    //     String e=add("ted","want's","dhii");
    //     System.out.println(e);
        
    //     float i=div(1000,10);
    //     System.out.println("%"+i);
        
    //     String j=add("bad","karma","vibes");
    //     System.out.println(j);
        
    //     int o=mult(5,6,7);
    //     System.out.println(o);
        
    //     double s=modu(50,6);
    //     System.out.println(s);
        
    //     char w=objt('j');
    //     System.out.println(w);
    // }
    // public static String add(String a,String b,String c){
    //     String d=a+" "+b+" "+c;
    //     return d;
    // }
    // public static float div(float f,float g){
    //     float h=f/g;
    //     return h;
    // }
    // public static int mult(int k,int l,int m){
    //     int n=k*l*m;
    //     return n;
    // }
    // public static double modu(double p,double q){
    //     double r=p%q;
    //     return r;
    // }
    // public static char objt(char s){
    //     char t = s;
    //     return t;
    // }
    
    public static void main(String[] args) {
        add();
        // meth obj=new meth();
        // obj.add(89, 67);
        // int d=add(45, 56);
        System.out.println(add(45, 56));
    }
    static void add(){
       int a=14;
       int b=23;
        int c=a+b;
        System.out.println(c);
    }
    static int add(int a,int b){
        int c=a+b;
        return c;
    }
}