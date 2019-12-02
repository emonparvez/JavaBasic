public class Exception_Fimally_More {
    public static void main(String[] args) {
        try{
        int i=10;
        int result=i/2;
        //int result=i/0;
        }
        
        catch(IndexOutOfBoundsException ae){
            System.out.println("Can not divide number by 0" +ae);
            
        }
        finally{
            
            System.out.println("Finally found");
            
        }
           
        System.out.println("Did not catch");
        
        
    }
}

