public class claobj {
   
    public static void main(String[] args){
        model kl=new model();  
        kl.name="sakthi";
        kl.rollno=12;
        model k2=new model();
        k2.name="jeeva";
        k2.rollno=13;
        kl.info();
        k2.info();
    }
}
class model{
    String name;
    int rollno;
    
    public void info(){
        System.out.println(name);
        System.out.println(rollno);
    }
    
}