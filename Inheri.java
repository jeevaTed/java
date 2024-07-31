class school{
    int rank;
    void study(){
        System.out.println("study");
    }
    void exams(){
        System.err.println("exams");
    }    
}
class clg extends school{
    int ragging;
}
class work extends clg{
    int working;
    void project(){
        System.out.println("Project");
    }
}
public class Inheri {
    public static void main(String[] args) {
        clg obj=new clg();
        obj.ragging=12;
        obj.study();
        obj.exams();
        System.out.println(obj.ragging);

    }
}
// public class inherit{
//     public static void main(String[]args){

//     }
// }
