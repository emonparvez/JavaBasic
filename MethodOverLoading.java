package JavaBasic_Codes;

public class MethodOverLoading {

    
   public void over(){
       System.out.println("no perametar");
} 
public int over(int a,int b){
    System.out.println(a);
     System.out.println(b);
     return a;
}
public int over(int a,int b,int c){
    int x=a+b+c;
   
     System.out.println(x);
     return x;
}
public void over(int x,int y,double z){
    System.out.println(""+x);
    System.out.println(""+y);
    System.out.println(""+z);
    

   
     
}
    public static void main(String[] args) {
        MethodOverLoading obj=new MethodOverLoading();
        obj.over();
        obj.over(1,1);
        obj.over(22, 22, 22);
        obj.over(437, 444, 444.07);
        
    }
    
}
