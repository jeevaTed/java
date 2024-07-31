class Overlo{
    int min(int a, int b){
         if(a>b){
             return b;
        }
        else{
            return a;
        }
    }
    int min(int[] v){
        int mini=v[0];
        for(int i=1;i<v.length;i++){
            if(v[i]<mini){
                mini=v[i];
            }
        }
        return mini;
    }
}
public class Mini{
    public static void main(String[] args) {
        Overlo obj=new Overlo();
        int min1=obj.min(8, 9);
        System.out.println(min1);
        int[] v={5,6,8,6};
        int min2=obj.min(v);
        System.out.println(min2);
    }
}
