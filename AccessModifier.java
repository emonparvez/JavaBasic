package JavaBasic_Codes;


public class AccessModifier { 
    
    
    
private void privateaccess()
{
    System.out.println("Hello Private");
}
void voidaccess()
{
    System.out.println("Hello default");
    

}  

public void publicaccess(){
    
    System.out.println("Hello public");
}  

 protected void protectedaccesss(){
     System.out.println("Hello protected");
 }
 public static void main(String args[])
{  

    AccessModifier acc=new AccessModifier();
    
    acc.privateaccess();
    acc.voidaccess();
    acc.publicaccess();
    acc.protectedaccesss();
} 
 


 
}


    

 