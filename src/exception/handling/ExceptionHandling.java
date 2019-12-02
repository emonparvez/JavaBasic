
package exception.handling;

//exception are inherit from throwable class

//If exception are diectly inherit from throwable class (error and run time exception ARE NOT INHERIT DIRECTLY) then its checked exception


//Exception Handling
//1. Checked(compile time)(io ecxception ,sql exception,class not found exception)

//2.Unchecked,(run time exception  (run time error) (arithmetic exception
//,number format exception(index out off bound exception(ARRAY,STRING)))),

//3.Error(we can not handle this exception in the programme)

//============================To handle exception these keywords are used===========================================

//try  ( If we are definite that there will be an error then we use try  )
//catch,finally,throw,throws


public class ExceptionHandling {

    public static void main(String[] args) {

        
            
//        int i=10;
//        int p=0;
//        int result = i/p;
//            
//        System.out.println("The result is : " +result);
//

        try{
        
        int i=10;
        int p=0;
        int result = i/p;
            System.out.println("The result is : " +result);
        
    }
        catch(Exception e){
            //System.out.println(e);
            System.out.println("WE CAN NOT DIVIDE INT BY ZERO");
        }


        System.out.println("This is Hudai Line");
        






    }
    
}
