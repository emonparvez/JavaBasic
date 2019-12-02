
public class EXCEPTION_FINNALY {
    
    public static void main(String[] args) {
        try{
        int i=10;
        int result=i/0;
        
        }
        
        catch(Exception ae){
            System.out.println("Can not divide number by 0" +ae);
            
        }
        finally{
            
            System.out.println("Finally found");
            
        }
           
        
        
        
    }
    
    
    
}
