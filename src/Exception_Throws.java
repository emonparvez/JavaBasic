public class Exception_Throws {
    
    static void validate(int age )
    {
        if(age<18)
        {
             throw new ArithmeticException("AGE IS UNDER 18");
                  
        }
        else{
        
            System.out.println("Age is valid");
        
        }   
            
        }
        
    public static void main(String[] args) {
   
       
        
        try{
            
             validate(15);
            
            
        }
        catch(ArithmeticException e){
        
            System.out.println(e);
        
                }
}
        
        
    }
    
    
    
    
    

