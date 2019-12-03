package JavaBasic_Codes;

public class Constructor {

    
    int roll;
    int age;
    String name;
    
    public Constructor(){
    
        System.out.println("Hellooooooo default Constructor");
    }
    public Constructor(int r,String n,int a){  
    
        roll=r;
        age=a;
        name=n;
        System.out.println(roll);
        System.out.println(name);
        System.out.println(age);
}
        public Constructor(int r,int a){
    
        roll=r;
        age=a;
      
        System.out.println(roll);
        System.out.println(age);
}
    
    
    
    
    public static void main(String[] args) {
       
        Constructor c=new Constructor();
         System.out.println("===========================");
        Constructor c1=new Constructor(100,"Atik",17);
        System.out.println("===========================");
        Constructor c2=new Constructor(101,17);
        
        
        
        
        
    }
    
}